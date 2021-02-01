package com.interview.chessapi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChessResponse {
    @JsonProperty("value")
    String value;

    public ChessResponse(String value){
        this.value=value;
    }
}
