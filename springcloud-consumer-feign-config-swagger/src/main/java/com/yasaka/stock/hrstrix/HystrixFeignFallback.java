package com.yasaka.stock.hrstrix;

import com.yasaka.stock.feign.MFeignClient;
import com.yasaka.stock.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HystrixFeignFallback implements MFeignClient {
    @Override
    public User getUser(String id) {
        User user = new User();
        user.setId("233");
        return user;
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<User>();
    }
}