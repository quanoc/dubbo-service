package org.quantumcs.dubbo.service.c.service;

import org.quantumcs.dubbo.service.client.ServiceC;
import org.quantumcs.dubbo.service.client.ServiceD;
import org.quantumcs.dubbo.service.client.ServiceE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * JThink@JThink
 *
 * @author JThink
 * @version 0.0.1
 * @desc
 * @date 2016-12-14 16:50:05
 */
@Service
public class ServiceCImpl implements ServiceC {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceCImpl.class);

    @Autowired
    private ServiceD serviceD;
    @Autowired
    private ServiceE serviceE;

    @Override
    public String invokeC() {
        LOGGER.info("调用服务D和E");
        return this.serviceD.invokeD() + " and " + this.serviceE.invokeE();
    }
}
