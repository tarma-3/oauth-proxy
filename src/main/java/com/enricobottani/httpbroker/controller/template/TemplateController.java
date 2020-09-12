package com.enricobottani.httpbroker.controller.template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {
    @GetMapping("/get")
    public String getCourses() {
        return "getRequest";
    }
}
