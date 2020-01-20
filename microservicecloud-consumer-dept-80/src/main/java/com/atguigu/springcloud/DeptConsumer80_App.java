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
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Description:  <br>
 *
 * @author 18005
 * @create 2020/1/19   
 * @since 1.0.0
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class DeptConsumer80_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}