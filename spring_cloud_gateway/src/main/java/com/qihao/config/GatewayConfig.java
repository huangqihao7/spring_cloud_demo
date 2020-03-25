package com.qihao.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/3/25 10:09
 */
@Configuration
public class GatewayConfig {

    @Value("${order.uri}")
    private String orderUri;

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/order/**")
                        .uri(orderUri)
                ).build();
    }


}
