package org.quantumcs.dubbo.service.c.configuration.dubbo;

import com.jthink.spring.boot.starter.dubbox.DubboService;
import org.quantumcs.dubbo.service.client.ServiceC;
import org.quantumcs.dubbo.service.client.ServiceD;
import org.quantumcs.dubbo.service.client.ServiceE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * JThink@JThink
 *
 * @author JThink
 * @version 0.0.1
 * @desc dubbo的配置
 * @date 2016-12-14 16:58:18
 */
@Configuration
public class DubboConfiguration {

    @Autowired
    private DubboService dubboService;
    @Autowired
    private ServiceC serviceCImpl;

    @Bean
    public ServiceD serviceD() {
        return this.dubboService.get(ServiceD.class);
    }

    @Bean
    public ServiceE serviceE() {
        return this.dubboService.get(ServiceE.class);
    }

    @PostConstruct
    public void exportDubboService() {
        this.dubboService.export(ServiceC.class, this.serviceCImpl);
    }
}
