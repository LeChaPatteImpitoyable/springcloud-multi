package com.yasaka.stock.service.impl;

import com.yasaka.stock.base.BaseService;
import com.yasaka.stock.base.DAOInterface;
import com.yasaka.stock.model.User;
import com.yasaka.stock.repository.UserRepository;
import com.yasaka.stock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Administrator on 8/14 0014.
 */
@Transactional
@Service
public class UserServiceImpl  extends BaseService<User> implements UserService{

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;


    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    protected DAOInterface<User> getDAOInterface() {
        return userRepository;
    }
}
