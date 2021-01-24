package com.interview.chessapi.controller;

import com.google.gson.Gson;
import com.interview.chessapi.entity.Response;
import com.interview.chessapi.entity.input.Request;
import com.interview.chessapi.entity.input.Start;
import com.interview.chessapi.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class Play {

    @Autowired
    private StartService startService;


    @PostMapping(
            value = "/playChess", consumes = "application/json", produces = "application/json")
    public Response startTheMatch(@RequestBody String inputPayLoad) {
        System.out.println( ">>> startTheMatch started ");
        System.out.println( "inputPayLoad : "+inputPayLoad);
        Request convertedObject = new Gson().fromJson(inputPayLoad, Request.class);

        System.out.println("Converted object : "+convertedObject);
        System.out.println(convertedObject.getRequest());
        if(convertedObject.getRequest().equals("START")) {
            //startService.startMatch();
            Response response = new Response("READY");
            System.out.println( "set the value to Ready");
            return response;
        }
        else{
            System.out.println( "In else ");
            return null;
        }
    }
}
