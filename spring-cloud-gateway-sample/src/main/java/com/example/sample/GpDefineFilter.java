package com.example.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class GpDefineFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("[pre]-Enter GpDefineFilter");
        return chain.filter(exchange).then(Mono.fromRunnable(()->{
            log.info("[post]-Return Result");
        }));
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
