package com.mapper.dao;


import com.bean.bo.userInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userInfoDao {


    List<userInfo> queryUserInfo();
}
