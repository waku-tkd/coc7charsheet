package com.example.coc7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {
    @RequestMapping("/top")
        public String index() {
            return "hello";
        }
}
