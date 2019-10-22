package com.feignchonggou.feignclient.service;

import com.feignchonggou.feignapi.model.User;

public interface OrderService {

    public User getUserByOrderId();
}
