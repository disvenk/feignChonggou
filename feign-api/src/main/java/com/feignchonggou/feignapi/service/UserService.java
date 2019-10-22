package com.feignchonggou.feignapi.service;

import com.feignchonggou.feignapi.model.User;
import org.springframework.web.bind.annotation.RequestMapping;

public interface UserService {

    @RequestMapping("/getUser")
    public User getUser();
}
