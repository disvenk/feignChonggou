package com.feignchonggou.feignclient.fallback;

import com.feignchonggou.feignapi.model.User;
import com.feignchonggou.feignclient.userApi.UserServiceFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFallback implements UserServiceFeign{


    @Override
    public User getUser() {
        return null;
    }
}
