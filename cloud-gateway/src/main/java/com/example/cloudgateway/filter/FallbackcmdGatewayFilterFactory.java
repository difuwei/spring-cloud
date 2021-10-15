package com.example.cloudgateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Consumer;

@Component
public class FallbackcmdGatewayFilterFactory extends AbstractGatewayFilterFactory {
    @Override
    public GatewayFilter apply(String routeId, Consumer consumer) {
        return super.apply(routeId, consumer);
    }

    @Override
    public GatewayFilter apply(Consumer consumer) {
        return super.apply(consumer);
    }

    @Override
    public GatewayFilter apply(Object config) {
        return null;
    }

    @Override
    public GatewayFilter apply(String routeId, Object config) {
        return super.apply(routeId, config);
    }

    @Override
    public String name() {
        return super.name();
    }

    @Override
    public ShortcutType shortcutType() {
        return super.shortcutType();
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return super.shortcutFieldOrder();
    }

    @Override
    public String shortcutFieldPrefix() {
        return super.shortcutFieldPrefix();
    }
}
