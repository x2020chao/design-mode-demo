package com.example.demo.mode.visitor.component;

import java.util.Iterator;

import com.example.demo.mode.visitor.entity.Directory;
import com.example.demo.mode.visitor.entity.Entity;
import com.example.demo.mode.visitor.entity.File;

public class ListVisitor extends Visitor {
    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String saveDir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator<Entity> it = directory.iterator();
        while (it.hasNext()) {
            Entity entity = it.next();
            entity.accept(this);
        }
        currentdir = saveDir;
    }
}
