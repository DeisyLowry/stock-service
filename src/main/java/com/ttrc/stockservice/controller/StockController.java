package com.ttrc.stockservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    @GetMapping("/test")
    public String test(){
        return "Hello Test Inside";
    }


}