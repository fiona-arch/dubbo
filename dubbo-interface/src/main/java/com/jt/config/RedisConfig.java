package com.jt.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

@Configuation
@PropertySource("classpath:/properties/redis.properties")
public class RedisConfig {
    @Value("${redis.clusters}")
    private String jedisClusters;

    @Bean
    @Scope("prototype")
    public JedisCluster jedisCluster(){
        Set<HostAndPort> nodes=new HashSet<HostAndPort>();
        String []strNode=jedisClusters.split(",");
        for(String node:strNode){
            String []hostAndPort=node.split(":");
            String host=hostAndPort[0];
            int port=Integer.parseInt(hostAndPort[1]);
            nodes.add(new HostAndPort(host,port));
        }

    }

}
