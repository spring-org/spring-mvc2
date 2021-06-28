package com.example.converter;

import com.example.converter.domain.UserData;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data"); //문자 타입 조회 Integer intValue = Integer.valueOf(data); //숫자 타입으로 변경 System.out.println("intValue = " + intValue);
        return "ok";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data) {
        System.out.println("data = " + data);
        return "ok";
    }

    @GetMapping("/hello-v3")
    public String helloV3(@ModelAttribute UserData data) {
        System.out.println("data = " + data);
        return "ok";
    }

    @GetMapping("/hello-v4/{userId}")
    public String helloV4(@PathVariable Integer data) {
        System.out.println("data = " + data);
        return "ok";
    }

}
