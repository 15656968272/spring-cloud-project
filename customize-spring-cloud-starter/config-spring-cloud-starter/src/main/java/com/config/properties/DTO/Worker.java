package com.config.properties.DTO;


import org.springframework.stereotype.Component;

@Component
public class Worker {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
