package com.ttrc.stockservice.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stocks")
@AllArgsConstructor
public class StockController {

    @GetMapping("/test")
    public String test(){
        return "Hello Test Inside";
    }


    // Build Save Employee REST API
    @PostMapping
    public String saveEmployee(){
        return "Inside the Post Call";

    }

    @GetMapping
    public String getAllStocks(){
        return "Inside the get all stocks Call";
    }


    @GetMapping("{id}")
    public String getEmployee(@PathVariable("id") String stockSymbol){
        String localSymbol = stockSymbol;
        return "Inside the get all stocks by symbol Call " + localSymbol;
    }

}