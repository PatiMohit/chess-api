package com.interview.chessapi.service;

import com.interview.chessapi.entity.Game;
import com.interview.chessapi.entity.Player;
import com.interview.chessapi.entity.input.Ready;
import com.interview.chessapi.entity.input.Start;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StartService {


    Game game;

    List<Game> totalGames;

    public void startMatch(){
        game= new Game();
        Player whitePlayer= new Player();
        Player blackPlayer= new Player();
        game.setBlackPlayer(blackPlayer);
        game.setWhitePlayer(whitePlayer);
        totalGames.add(game);


    };
}
