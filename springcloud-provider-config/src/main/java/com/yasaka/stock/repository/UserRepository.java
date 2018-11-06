/**
 * 
 */
package com.yasaka.stock.repository;

import com.yasaka.stock.base.DAOInterface;
import com.yasaka.stock.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends DAOInterface<User>{
    User findByUsername(String username);
}
