package com.yasaka.stock.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DAOInterface<T> extends JpaRepository<T, String>,JpaSpecificationExecutor<T>{

}
