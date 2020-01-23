package com.cricket.JB.model;

import java.util.*;

public class Team<T extends Player>{
    private String name;
    private List<T> members;
    private Team[] teams;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(!members.contains(player)){
            this.members.add(player);
            System.out.println("Added player "+player.getId()+" to Team " + this.getName());
            return true;
        }

        return false;
    }

    public List<T> getMembers(){
        return this.members;
    }
}
