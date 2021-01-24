package com.interview.chessapi.controller;

import com.interview.chessapi.entity.input.Ready;
import com.interview.chessapi.entity.input.Start;
import com.interview.chessapi.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Play {

    @Autowired
    private StartService startService;

    @PostMapping(
            value = "/playChess", consumes = "application/json", produces = "application/json")
    public Ready startTheMatch(@RequestBody String inputPayLoad) {

        if(inputPayLoad.equals("START")) {
            startService.startMatch();
            Ready response= new Ready();
            response.setValue("READY");
            return response;
        }
        else{
            return null;
        }
    }
}
