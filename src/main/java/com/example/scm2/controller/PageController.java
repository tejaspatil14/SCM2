package com.example.scm2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home() {
        System.out.println("Home Page Handler");
        return "home";
    }

    @GetMapping("/about")
    public String aboutPage() {
        System.out.println("About Page Loading ....");
        return "about";
    }
    // @GetMapping("/base")
    // public String basePage() {
    //     System.out.println("Base Page Loading ....");
    //     return "base";
    // }

    @GetMapping("/services")
    public String servicesPage() {
        System.out.println("Services Page Loading.....");
        return "services";
    }

  
}
