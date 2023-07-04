package com.example.sessionstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
public class LoginController {

//    분산 환경에서 문제생긴다.
//    HashMap<String, String> sessionMap = new HashMap<>();

    @GetMapping("/login")
    public String login(HttpSession httpSession, @RequestParam String name) {
        httpSession.setAttribute("name", name);

        return "saved";
    }

    @GetMapping("/myName")
    public String myName(HttpSession httpSession) {
        String myName = (String) httpSession.getAttribute("name");

        return myName;
    }
}
