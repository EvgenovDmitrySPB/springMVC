package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by EvgenovDS on 19.11.2018.
 */
@Controller
public class MvcController {

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping(value = "/visit1", method = RequestMethod.GET)
    public String handlegetrequest(Model model){
        System.out.println("controller start...");

        return "/jsp/index.jsp";
    }

    @RequestMapping("/start1")
    public String GetStart(Model model){
        System.out.println("controller start...");

        return "/jsp/index.jsp";
    }

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }
}
