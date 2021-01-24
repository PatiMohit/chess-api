package com.interview.chessapi.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;


@Entity
public class Game {
    @Autowired
    Player blackPlayer;

    @Autowired
    Player whitePlayer;

    @Autowired
    CurrentPositions currentPosition;


    public void resetGame(){
        this.currentPosition= null;
    }

    public void setBlackPlayer(Player player){
        this.blackPlayer=player;
    }

    public Player getBlackPlayer(){
        return this.blackPlayer;
    }
    public Player getWhitePlayer(){
        return this.whitePlayer;
    }
    public void setWhitePlayer(Player player){
        this.whitePlayer=player;
    }

}
