package com.interview.chessapi.controller;

import com.google.gson.Gson;
import com.interview.chessapi.entity.ChessResponse;
import com.interview.chessapi.entity.input.Request;
import com.interview.chessapi.exception.InvalidInputException;
import com.interview.chessapi.service.StartService;
import com.interview.chessapi.util.Constant;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Play {

    @Autowired
    private StartService startService;

    private Logger logger= LoggerFactory.logger(Play.class);
    @PostMapping(
            value = "/playChess", consumes = "application/json", produces = "application/json")
    public ChessResponse startTheMatch(@RequestBody String inputPayLoad) throws InvalidInputException {

        logger.info(">>> startTheMatch");
        logger.info("inputPayLoad : " + inputPayLoad);
        Request convertedObject = new Gson().fromJson(inputPayLoad, Request.class);

        logger.info("Converted object : " + convertedObject);
        logger.info(convertedObject.getRequest());
        if (convertedObject.getRequest().equals("START")) {
            ChessResponse response = new ChessResponse("READY");
            logger.info("set the value to Ready");
            return response;
        } else if (convertedObject.getRequest().equals("move")) {
            logger.info("In else ");
            return null;
        }
        else{
            logger.error("Invalid move "+convertedObject.getRequest());
            throw new InvalidInputException(Constant.INVALID_MOVE);
        }

    }
}
