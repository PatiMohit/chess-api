package com.interview.chessapi.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;

@Entity
public class Player {
    @Autowired
    User user;


    @Autowired
    Game game;
}
