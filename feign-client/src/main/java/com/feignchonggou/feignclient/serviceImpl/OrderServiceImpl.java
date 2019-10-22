package com.feignchonggou.feignclient.serviceImpl;

import com.feignchonggou.feignapi.model.User;
import com.feignchonggou.feignclient.service.OrderService;
import com.feignchonggou.feignclient.userApi.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @RequestMapping("/getUser")
    @Override
    public User getUserByOrderId() {
        System.out.println("进入了");
        return userServiceFeign.getUser();
    }
}
