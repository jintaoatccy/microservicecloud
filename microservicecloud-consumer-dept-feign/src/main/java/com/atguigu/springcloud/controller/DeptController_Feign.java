/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司
 * Author:  18005
 * Date:  2020/1/19 9:40
 * History:
 * <author> <time> <version> <desc>
 */
package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Description: RestTemplate提供了多种便捷访问远程Http服务的方法，
 * 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集
 * <br>
 *
 * @author 18005
 * @create 2020/1/19
 * @since 1.0.0
 */
@RestController
public class DeptController_Feign
{
    @Autowired
    private DeptClientService service = null;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)
    {
        return this.service.add(dept);
    }
}