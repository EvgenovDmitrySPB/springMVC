package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;

/**
 * Created by EvgenovDS on 19.11.2018.
 */
@RestController
public class RstController {

    @GetMapping("/start")
    public String Test(){
        return "start page";
    }

    @GetMapping("/visit")
    public String Visit(){
        return "visit page";
    }
}
