package com.firebird.zhangkuispringstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter")
public class FilterController {

    @GetMapping("/name")
    public String filterName(){


        return "Ok";
    }

    @GetMapping("/age")
    public String ageFilter(){
        return "Ok";
    }
}
