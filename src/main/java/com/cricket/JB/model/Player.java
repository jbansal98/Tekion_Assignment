package com.cricket.JB.model;

public class Player{
    private int id;
    private int ballsplayed;
    private int sixes;
    private int fours;
    private int score;
    private float nofovers;
    private int maidenovers;
    private int runsconceded;
    private int wickets;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setBallsplayed(int ballsplayed){
        this.ballsplayed = ballsplayed;
    }
    public int getBallsplayed(){
        return ballsplayed;
    }
    public void setSixes(int sixes){
        this.sixes = sixes;
    }
    public int getSixes(){
        return sixes;
    }
    public void setFours(int fours){
        this.fours = fours;
    }
    public int getFours() {
        return fours;
    }
    public void setScore(int score){
        this.score=score;
    }
    public int getScore() {
        return score;
    }
    public void setMaidenovers(int maidenovers) {
        this.maidenovers = maidenovers;
    }
    public int getMaidenovers() {
        return maidenovers;
    }
    public void setNofovers(float nofovers) {
        this.nofovers = nofovers;
    }
    public float getNoofovers(){
        return nofovers;
    }
    public void setRunsconceded(int runsconceded) {
        this.runsconceded = runsconceded;
    }
    public int getRunsconceded() {
        return runsconceded;
    }
    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
    public int getWickets() {
        return wickets;
    }
}

//    class BowlingPlayer extends Player{
//    public BowlingPlayer(int id,int ballsplayed,int sixes,int fours,int score,int nofovers,int maidenovers,int runsconceded,int wickets){
//        super(id,ballsplayed,sixes,fours,score,nofovers,maidenovers,runsconceded,wickets);
//    }
//}
