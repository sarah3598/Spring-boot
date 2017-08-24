package com.yuanshuo.test.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.yuanshuo.test.entity.UserEntity;

import java.io.Serializable;

import javax.transaction.Transactional;

/**
 * ========================
 * Created by Administrator on 2017/8/23.
 * ========================
 */
public interface UserJPA extends
        JpaRepository<UserEntity, Long>,
        JpaSpecificationExecutor<UserEntity>,
        Serializable{

}

