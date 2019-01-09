package com.mapper.service;

import com.bean.bo.userInfo;
import com.mapper.dao.userInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {


    @Autowired
    private userInfoDao userInfoDao;

    public List<userInfo> queryAlluser() {
        return userInfoDao.queryUserInfo();
    }
}
