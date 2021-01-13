package com.morrie.myshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by morrie kim on 2020/04/09.
 */
@Controller
@Slf4j
public class HomeController {

    @RequestMapping("/")
    public String home(){
        log.info("home controller");
        return "home";
    }

}
