/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司
 * Author:  18005
 * Date:  2020/1/18 23:48
 * History:
 * <author> <time> <version> <desc>
 */
package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:  <br>
 *
 * @author 18005
 * @create 2020/1/18   
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class DeptProvider8003_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptProvider8003_App.class, args);
    }
}