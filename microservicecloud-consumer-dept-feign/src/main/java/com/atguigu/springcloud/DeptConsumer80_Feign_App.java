/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司
 * Author:  18005
 * Date:  2020/1/19 9:44
 * History:
 * <author> <time> <version> <desc>
 */
package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description:  <br>
 *
 * @author 18005
 * @create 2020/1/19   
 * @since 1.0.0
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
@ComponentScan("com.atguigu.springcloud")
public class DeptConsumer80_Feign_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}