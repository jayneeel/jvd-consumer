package com.jayneel.jvd_consumer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @RequestMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @RequestMapping("/addjob")
    public String addJob(){
        return "addjob";
    }

    @RequestMapping("/viewalljobs")
    public String viewAllJobs(){
        return "viewalljobs";
    }

    @RequestMapping("/handleForm")
    public String handleForm(){
        return "success";
    }
}
