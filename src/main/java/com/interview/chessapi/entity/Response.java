package com.interview.chessapi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    @JsonProperty("value")
    String value;

    public Response(String value){
        this.value=value;
    }
}
