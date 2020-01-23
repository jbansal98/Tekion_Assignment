package com.cricket.JB.model;

import java.util.HashMap;

public class Result{

    private String winner;
    private HashMap<String,Integer> hmapA = new HashMap<>();
    private HashMap<String,Integer> hmapB = new HashMap<>();
    public void setWinner(String winner){
        this.winner = winner;
    }
    public String getWinner(){
        return winner;
    }

    public void setIND(HashMap<String, Integer> hmapA) {
        this.hmapA = hmapA;
    }

    public void setAUS(HashMap<String, Integer> hmapB) {
        this.hmapB = hmapB;
    }
    public HashMap<String,Integer> getIND(){
        return hmapA;
    }
    public HashMap<String,Integer> getAUS(){
        return hmapB;
    }
}
