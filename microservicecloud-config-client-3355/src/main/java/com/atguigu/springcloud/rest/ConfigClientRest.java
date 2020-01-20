/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司
 * Author:  18005
 * Date:  2020/1/20 0:26
 * History:
 * <author> <time> <version> <desc>
 */
package com.atguigu.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:  <br>
 *
 * @author 18005
 * @create 2020/1/20   
 * @since 1.0.0
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig()
    {
        String str = "applicationName: "+applicationName+"\t eurekaServers:"+eurekaServers+"\t port: "+port;
        System.out.println("******str: "+ str);
        return "applicationName: "+applicationName+"\t eurekaServers:"+eurekaServers+"\t port: "+port;
    }
}