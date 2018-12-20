package template.Agent.entity;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public class ToDo {

    public String check(HttpSession httpSession, String a, String b) {
        return "new";
    }

}
