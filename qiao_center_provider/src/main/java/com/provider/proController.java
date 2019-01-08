package com.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class proController {

    @GetMapping("/get")
    public String getMessage(){
        return "提供服务:center";
    }
}
