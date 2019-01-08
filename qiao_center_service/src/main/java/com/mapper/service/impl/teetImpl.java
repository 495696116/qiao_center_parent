package com.mapper.service.impl;

import com.bo.bo;
import com.mapper.service.teset;
import org.springframework.stereotype.Service;

@Service
public class teetImpl implements teset {


    @Override
    public bo getBo() {
        bo b= new bo();
        b.setId("111");
        b.setName("2222");
        return b;
    }
}
