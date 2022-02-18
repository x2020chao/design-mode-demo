package com.example.demo.mode.visitor;

import com.example.demo.mode.visitor.component.ListVisitor;
import com.example.demo.mode.visitor.entity.Directory;
import com.example.demo.mode.visitor.entity.File;
import com.example.demo.mode.visitor.entity.FileTreatmentException;

public class TestListVisitor {
    public static void main(String[] args) {
        try {
            Directory rootDirectory = new Directory("root");
            Directory binDirectory = new Directory("bin");
            Directory tmpDirectory = new Directory("tmp");
            rootDirectory.add(binDirectory);
            rootDirectory.add(tmpDirectory);
            binDirectory.add(new File("图解设计模式", 200));
            rootDirectory.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
