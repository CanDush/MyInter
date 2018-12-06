package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Henry.Jiang
 * @create 2018-12-06 下午5:37
 **/
@Controller
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public String Login(){
        return "hello.html";
    }
}
