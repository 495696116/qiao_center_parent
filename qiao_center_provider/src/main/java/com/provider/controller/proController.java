package com.provider.controller;

import com.mapper.service.teset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class proController {

    @Autowired
    private teset teset;

    @GetMapping("/get")
    public String getMessage() {

        return "提供服务:center" + teset.getBo().getId() + "---" + teset.getBo().getName();
    }
}
