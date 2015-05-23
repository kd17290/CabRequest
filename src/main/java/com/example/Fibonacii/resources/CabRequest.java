package com.example.Fibonacii.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by kuldeep on 23/5/15.
 */
public class CabRequest {
    @JsonProperty
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
