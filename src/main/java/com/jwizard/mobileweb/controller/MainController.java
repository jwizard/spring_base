package com.jwizard.mobileweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 2835 on 2015-10-30.
 */
@Controller("mainController")
public class MainController {

    @RequestMapping("/main")
    public String main(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "main";
    }
}
