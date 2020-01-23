package com.cricket.JB.model;

import java.util.*;

public class StartGame {
    static int temp;

    StartGame(int max) {
        temp = max;
    }

    public HashMap<String, Integer> start(Team teamobj1, Team teamobj2) {
        List<Player> player1 = teamobj1.getMembers();
        List<Player> player2 = teamobj2.getMembers().subList(6, 11);
        HashMap<String, Integer> hap = new HashMap<>();
        hap.put("runs", 0);
        hap.put("wicket", 0);
        hap.put("fours", 0);
        hap.put("sixes", 0);
        hap.put("ballsplayed", 0);
        Random rand = new Random();
        int count = 0;
        int bowlercount = 0;
        int maidenballscount = 0;
        for (int j = 1; j <= 300; j++) {
            int n = rand.nextInt(8);
            if (n == 0) maidenballscount++;
            if (j % 6 == 0) {
                if (maidenballscount == 6) {
                    player2.get(bowlercount % 5).setMaidenovers(player2.get(bowlercount % 5).getMaidenovers() + 1);
                    maidenballscount = 0;
                }
                player2.get(bowlercount % 5).setNofovers(player2.get(bowlercount % 5).getNoofovers() + 1);
                bowlercount++;
            }
            if (n != 7) {
                player1.get(count).setScore(player1.get(count).getScore() + n);
                player1.get(count).setBallsplayed(player1.get(count).getBallsplayed() + 1);
                player2.get(bowlercount % 5).setRunsconceded(player2.get(bowlercount % 5).getRunsconceded() + n);
                hap.put("runs", hap.get("runs") + n);
                hap.put("ballsplayed", j);
            } else if (n == 7) {
                hap.put("wicket", hap.get("wicket") + 1);
                hap.put("ballsplayed", j);
                player1.get(count).setBallsplayed(player1.get(count).getBallsplayed() + 1);
                player2.get(bowlercount % 5).setWickets(player2.get(bowlercount % 5).getWickets() + 1);
                count++;
                if (hap.get("wicket") == 10) {
                    player2.get(bowlercount % 5).setNofovers(player2.get(bowlercount % 5).getNoofovers() + (float) (j) % 6 / 10);
                    break;
                }
            }
            if (n == 4) {
                hap.put("fours", hap.get("fours") + 1);
                player1.get(count).setFours(player1.get(count).getFours() + 1);
            }
            if (n == 6) {
                hap.put("sixes", hap.get("sixes") + 1);
                player1.get(count).setSixes(player1.get(count).getSixes() + 1);
            }
            if (hap.get("runs") > temp) {
                player2.get(bowlercount%5).setNofovers(player2.get(bowlercount%5).getNoofovers() + (float) (j) % 6 / 10);
                break;
            }
        }
        temp = hap.get("runs");
        System.out.println(hap);
        return hap;
    }
}
