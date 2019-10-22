package com.feignchonggou.feignclient.userApi;

import com.feignchonggou.feignapi.service.UserService;
import com.feignchonggou.feignclient.fallback.UserFallback;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-memeber",fallback = UserFallback.class)//使用服务降级，服务请求异常后，会熔断到实现类
public interface UserServiceFeign extends UserService {

}
