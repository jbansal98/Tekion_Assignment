package com.cricket.JB.model;

import java.util.Arrays;
import java.util.HashMap;

public class Match {
    HashMap<String,Integer> hmapA = new HashMap<>();
    HashMap<String,Integer> hmapB = new HashMap<>();
    private Team teamA;
    private Team teamB;

    public Team[] createTeam(){
        Team[] tt = new Team[2];
        //Player TA[] = new Player[11];
        //Ta[i].setId(i+101);
        teamA = new Team("IND");
        for(int i=0;i<=10;i++){
            Player p = new Player();
            p.setId(i+101);
            teamA.addPlayer(p);
            }

        //Player TB[] = new Player[11];
        teamB = new Team("AUS");
        for(int i=0;i<=10;i++){
            Player p = new Player();
            p.setId(i+201);
            teamB.addPlayer(p);
        }
        tt[0]=  teamA;tt[1] = teamB;
        return tt;
    }

    public HashMap[] startInnings(Team[] teams){
        StartGame sg = new StartGame(Integer.MAX_VALUE);
        hmapA = sg.start(teams[0],teams[1]);
        hmapB = sg.start(teams[1],teams[0]);
        HashMap[] hp = new HashMap[2];
        hp[0] = hmapA;
        hp[1] = hmapB;
        return hp;
    }

    public Result finishmatch(HashMap<String,Integer> hmapA, HashMap<String,Integer> hmapB,Team[] teams) {
        Result r = new Result();
        String str = "";
        if(hmapA.get("runs")>hmapB.get("runs")){
            str = teams[0].getName()+" won by "+(hmapA.get("runs")-hmapB.get("runs") + " runs");

        }
        else if(hmapB.get("runs")>hmapA.get("runs")){
            str = teams[1].getName()+" won by "+(10-hmapB.get("wicket")+ " wickets");
        }
        else{
            str = "It's a draw!!";
        }
        r.setIND(hmapA);
        r.setAUS(hmapB);
        r.setWinner(str);
        return r;
    }
}
