package com.feignchonggou.feignserver.serviceImpl;

import com.feignchonggou.feignapi.model.User;
import com.feignchonggou.feignapi.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setName("disvenk");
        user.setAge("18");
        return user;
    }
}
