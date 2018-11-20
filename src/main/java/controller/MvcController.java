package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by EvgenovDS on 19.11.2018.
 */
@Controller
public class MvcController {

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
}
