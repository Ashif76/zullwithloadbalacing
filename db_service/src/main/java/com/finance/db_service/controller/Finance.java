package com.finance.db_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Finance {

    @GetMapping("/finance")
    public String getFinanceType(){
        return "instance 4";
    }
}
