package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import com.baizhi.util.MybatisUtil;

import java.util.UUID;

public class UserServiceImpl extends UserService {
    @Override
    public void register(User user) {
       try{
           //获取DAO实现类对象
           UserDAO ud = MybatisUtil.getSqlSession().getMapper(UserDAO.class);
           String id = UUID.randomUUID().toString();
           user.setId(id);
           ud.save(user);
           MybatisUtil.commit();
       }catch (Exception e){
           MybatisUtil.rollback();
       }

    }
}
