package com.honor.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/redis")
public class RedisSessionTestController {
    @RequestMapping("/session")
    @ResponseBody
    public String getSessionId(HttpServletRequest request){
        HttpSession session = request.getSession();
        return session.getId();
    }
}
