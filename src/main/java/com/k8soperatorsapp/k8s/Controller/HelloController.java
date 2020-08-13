package com.k8soperators.k8s.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
 
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Word";  
    }
}