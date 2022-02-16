package com.example.demo.mode.composite;

/**
 * File 和 Directory 一致性
 * 目录条目抽象类
 */
public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
