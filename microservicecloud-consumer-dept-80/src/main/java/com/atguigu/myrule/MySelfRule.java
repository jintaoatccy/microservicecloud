/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司
 * Author:  18005
 * Date:  2020/1/19 15:11
 * History:
 * <author> <time> <version> <desc>
 */
package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:  <br>
 *
 * @author 18005
 * @create 2020/1/19   
 * @since 1.0.0
 */
@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule()
    {
//        return new RandomRule();//Ribbon默认是轮询，我自定义为随机
        return new RandomRule_ZY();//我自定义为每个机器被访问5次
    }
}
