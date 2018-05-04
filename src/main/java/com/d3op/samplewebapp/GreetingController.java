package com.d3op.samplewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
     public void FindbugError () {
        Integer number1 = new Integer(123);
        Integer number2 = Integer.valueOf(123); 
        System.out.println("number1 =  " + number1);
        System.out.println("number2 =  " + number2);   
     }
}
