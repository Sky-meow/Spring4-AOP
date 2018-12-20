package template.test;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Test1 {
    public String get(){
        return "home";
    }
}
