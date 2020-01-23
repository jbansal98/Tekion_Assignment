package com.cricket.JB.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MatchController {
    Match match = new Match();
    HashMap[] hp = new HashMap[2];
    Team[] teams;

    public void setup(){
        teams = match.createTeam();
        hp = match.startInnings(teams);
    }

    public Team[] teamgenerator(){
        return teams;
    }

    public Result displayResult(){
        Result r = match.finishmatch(hp[0],hp[1],teams);
        return r;
        }
}
