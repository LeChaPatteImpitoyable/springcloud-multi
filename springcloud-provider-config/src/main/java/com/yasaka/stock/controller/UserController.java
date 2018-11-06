package com.yasaka.stock.controller;

import com.yasaka.stock.model.User;
import com.yasaka.stock.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public User getuser(@PathVariable String id) {
        User user = null;
        try {
            System.out.println(id);
            user = userService.find(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    /**
     * @return
     */
    @GetMapping("list")
    public List<User> users() {
        try {
            logger.info("calling trace demo backend");
            List<User> user = userService.findAll();
            if (user != null && user.size() != 0) {
                return user;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}