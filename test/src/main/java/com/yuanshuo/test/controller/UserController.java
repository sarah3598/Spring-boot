package com.yuanshuo.test.controller;

import com.yuanshuo.test.entity.UserEntity;
import com.yuanshuo.test.jpa.UserJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ========================
 * Created by Administrator on 2017/8/22.
 * ========================
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 查询用户列表方法
     * @return
     */
    @RequestMapping(value ="/list" ,method = RequestMethod.GET)
    public List<UserEntity> list(){
        return userJPA.findAll();
    }

    /**
     * 添加、更新用户方法
     * @param entity
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public UserEntity save(UserEntity entity)
    {
        return userJPA.save(entity);
    }
   
    /**
     * 删除用户方法
     * @param id 用户编号
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<UserEntity> delete(Long id)
    {
        userJPA.delete(id);
        return userJPA.findAll();
    }

}
