/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司
 * Author:  18005
 * Date:  2020/1/18 23:43
 * History:
 * <author> <time> <version> <desc>
 */
package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * Description:  <br>
 *
 * @author 18005
 * @create 2020/1/18
 * @since 1.0.0
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
