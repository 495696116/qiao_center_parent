package com.mapper.service.impl;

import com.bean.bo.userInfo;
import com.mapper.repository.userInfoDao;
import com.mapper.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userInfoServiceImpl implements UserInfoService {

    @Autowired
    private userInfoDao userInfoDao;

    @Override
    public List<userInfo> queryAlluser() {
        return userInfoDao.queryUserInfo();
    }



}
