/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司
 * Author:  18005
 * Date:  2020/1/20 0:08
 * History:
 * <author> <time> <version> <desc>
 */
package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Description:  <br>
 *
 * @author 18005
 * @create 2020/1/20   
 * @since 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }
}   