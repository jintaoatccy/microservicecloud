/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司
 * Author:  18005
 * Date:  2020/1/20 9:56
 * History:
 * <author> <time> <version> <desc>
 */
package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:  EurekaServer服务器端启动类,接受其它微服务注册进来<br>
 *
 * @author 18005
 * @create 2020/1/20   
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
    }
}   