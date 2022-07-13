package com.example.soloaws.controller;

import com.example.soloaws.dto.response.AwsResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // json으로 반환하는 컨트롤러
public class AwsController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public AwsResponseDto awsResponseDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new AwsResponseDto(name, amount);
    }

    @GetMapping("/prac")
    public String prac() {
        return "no";
    }
}
