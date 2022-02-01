package com.example.demo.mode.iterator.components;

/**
 * 所要遍历集合的接口
 */
public interface Aggregate {
    public abstract Iterator iterator(); // 生成用于遍历的迭代器
}
