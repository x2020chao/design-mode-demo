package com.example.demo.mode.chainofresponsibility;

// 解决问题编号为奇数的问题
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if ((trouble.getNumber() & 1) == 1) {
            return true;
        }
        return false;
    }
}
