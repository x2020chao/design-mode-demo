package com.example.demo.mode.mediator.concreate;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.example.demo.mode.mediator.components.Colleague;
import com.example.demo.mode.mediator.components.Mediator;

public class ColleaguCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;

    public ColleaguCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
