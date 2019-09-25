package com.baizhi.dao;

import com.baizhi.entity.User;

public interface UserDAO {
    //插入
    public void save(User user);
    //再添加一个方法
    public void add(User user);
}
