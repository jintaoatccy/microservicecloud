/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司
 * Author:  18005
 * Date:  2020/1/18 23:37
 * History:
 * <author> <time> <version> <desc>
 */
package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description:  <br>
 *
 * @author 18005
 * @create 2020/1/18   
 * @since 1.0.0
 */
@Mapper
public interface DeptDao
{
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
