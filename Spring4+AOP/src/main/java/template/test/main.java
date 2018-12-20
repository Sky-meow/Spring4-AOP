package template.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import template.Agent.config.SpringConfig;

public class main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        SaveBook saveBook = context.getBean(SaveBook.class);
//        saveBook.save("old",2);
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Test1 test1 = context.getBean(Test1.class);
        test1.get();
        System.out.println(test1.get());
    }
}
