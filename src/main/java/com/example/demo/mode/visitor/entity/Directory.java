package com.example.demo.mode.visitor.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.mode.visitor.component.Visitor;

public class Directory extends Entity {
    private String name;
    private List<Entity> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entity> iterator = dir.iterator();
        while (iterator.hasNext()) {
            size += iterator.next().getSize();
        }
        return size;
    }

    @Override
    public Entity add(Entity entity) throws FileTreatmentException {
        dir.add(entity);
        return this;
    }

    @Override
    public Iterator<Entity> iterator() throws FileTreatmentException {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
