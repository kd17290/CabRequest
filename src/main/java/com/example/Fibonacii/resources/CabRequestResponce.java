package com.example.Fibonacii.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by kuldeep on 23/5/15.
 */
public class CabRequestResponce {
    @JsonProperty
    long crnNumber;
    @JsonProperty
    CabRequest cr;

    public CabRequestResponce(long crnNumber, CabRequest cr) {
        this.crnNumber = crnNumber;
        this.cr = cr;
    }
}
