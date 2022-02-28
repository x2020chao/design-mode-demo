package com.example.demo.mode.chainofresponsibility;

// 永远不解决问题
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
