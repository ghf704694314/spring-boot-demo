package com.ghf.impl.repository;

import com.ghf.impl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * com.ghf.impl.repository
 *
 * @Author : Gaohf
 * @Description :
 * @Date : 2017/11/14
 */
public interface UserRepository extends JpaRepository<User,String>,JpaSpecificationExecutor<User> {
}
