/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司
 * Author:  18005
 * Date:  2020/1/19 10:28
 * History:
 * <author> <time> <version> <desc>
 */
package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:  <br>
 *
 * @author 18005
 * @create 2020/1/19   
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7002_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
