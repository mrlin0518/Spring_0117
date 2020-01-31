package com.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    
    @RequestMapping("/hi")
    public String sayHi(){
        return "Hi";
    }
    
    @RequestMapping("/yes")
    public String sayYes(){
        return "Yeeeeeeeeeeeee";
    }
}
