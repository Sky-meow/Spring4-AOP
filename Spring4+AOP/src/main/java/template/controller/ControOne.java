package template.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import template.Agent.entity.ToDo;
import template.Agent.config.SpringConfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/index.jsp")
public class ControOne {
    @GetMapping()
    public String getOne(HttpServletRequest request, String u, String p) {
        HttpSession session = request.getSession();
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ToDo toDo = context.getBean(ToDo.class);
        String a = toDo.check(session, u, p);
        System.out.println(a);
        return a;
    }
}
