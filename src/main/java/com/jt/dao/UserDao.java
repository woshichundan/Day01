package com.jt.dao;


import com.jt.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserDao {
    List<User> findall();
}
