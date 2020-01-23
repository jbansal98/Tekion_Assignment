package com.cricket.JB.model.controller;

import com.cricket.JB.model.Match;
import com.cricket.JB.model.MatchController;
import com.cricket.JB.model.Result;
import com.cricket.JB.model.Team;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mapping {
    MatchController mc = new MatchController();

    @RequestMapping("/match")
    public Result submit() {
        mc.setup();
        Result res = mc.displayResult();
        return res;
    }

    @RequestMapping("/scorecard")
    public Team[] creator(){
        Team[] t = mc.teamgenerator();
        return t;
    }
}

