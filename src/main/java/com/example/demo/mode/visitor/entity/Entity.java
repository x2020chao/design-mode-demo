package com.example.demo.mode.visitor.entity;

import java.util.Iterator;

public abstract class Entity implements Element {
    public abstract String getName();

    public abstract int getSize();

    public Entity add(Entity entity) throws FileTreatmentException {
        throw new FileTreatmentException();
    };

    public Iterator<Entity> iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    };

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
