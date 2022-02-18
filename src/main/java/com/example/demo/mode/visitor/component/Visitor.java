package com.example.demo.mode.visitor.component;

import com.example.demo.mode.visitor.entity.Directory;
import com.example.demo.mode.visitor.entity.File;

// 访问者抽象类
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
