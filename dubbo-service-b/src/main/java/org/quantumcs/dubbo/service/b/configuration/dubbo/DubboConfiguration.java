package org.quantumcs.dubbo.service.b.configuration.dubbo;

import com.jthink.spring.boot.starter.dubbox.DubboService;
import org.quantumcs.dubbo.service.client.ServiceB;
import org.quantumcs.dubbo.service.client.ServiceC;
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
    private ServiceB serviceBImpl;

    @Bean
    public ServiceC serviceC() {
        return this.dubboService.get(ServiceC.class);
    }

    @PostConstruct
    public void exportDubboService() {
        this.dubboService.export(ServiceB.class, this.serviceBImpl);
    }
}
