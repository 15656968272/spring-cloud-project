package com.study.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

import java.util.HashMap;
import java.util.Map;


@Deprecated
public class MyHealthIndicator extends AbstractHealthIndicator {



    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Map<String, String> map = new HashMap<>(1);
        map.put("jin", "sheng");
        builder.up().withDetails(map);
    }


//    @Override
//    public Health health() {
//        Map<String, String> map = new HashMap<>(1);
//        map.put("jin", "sheng");
//        return new Health.Builder().up().status("200").withDetails(map).build();
//    }
}
