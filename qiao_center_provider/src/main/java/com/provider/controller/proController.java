package com.provider.controller;

import com.bean.bo.userInfo;
import com.mapper.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class proController {

    @Autowired
    private UserInfoService userinfoService;

    @GetMapping("/get")
    public String getMessage() {

        List<userInfo>  list=userinfoService.queryAlluser();
        StringBuffer sb =new StringBuffer();
        list.forEach(m->{
            sb.append(m.getName());
        });
        return "提供服务:center" + sb.toString();
    }
}
