package com.example.demo.mode.mediator.components;

// 组员
public interface Colleague {
    public abstract void setMediator(Mediator mediator); // 告知组员 仲裁者

    public abstract void setColleagueEnabled(boolean enabled); // 告知组员仲裁者下达的指示
}
