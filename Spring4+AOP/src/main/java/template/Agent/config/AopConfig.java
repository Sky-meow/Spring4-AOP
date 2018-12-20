package template.Agent.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
@Aspect
public class AopConfig {
    public static ThreadLocal threadLocal = null;

    @Pointcut(value = "execution(* template.*.*.*.*(..))")
    public void xxx() {
    }

    @Before("xxx()")
    public void beforeAdvide(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getArgs()[1]);
        System.out.println("开始前置通知");
    }

    @Around("xxx()")
    public Object aroundAdvie(ProceedingJoinPoint point) throws Throwable {
        Object object = point.proceed(point.getArgs());
        if (point.getArgs()[1].equals("1")&&point.getArgs()[2].equals("1"))
//            ((HttpSession)point.getArgs()[0]).setAttribute("user","45");
            return object;
        else
            return "home";
    }
}
