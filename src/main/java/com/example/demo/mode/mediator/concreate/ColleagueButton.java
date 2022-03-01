package com.example.demo.mode.mediator.concreate;

import java.awt.Button;

import com.example.demo.mode.mediator.components.Colleague;
import com.example.demo.mode.mediator.components.Mediator;

public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
