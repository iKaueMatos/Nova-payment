package com.gateway.gateway.core.config.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdConfig {
    public ProdConfig() {
        System.out.println("Ambiente de produção!!");
    }
}
