package com.example.demo.mode.composite;

public class TestEntry {
    public static void main(String[] args) {
        try {
            Directory rootDirectory = new Directory("root");
            Directory binDirectory = new Directory("bin");
            Directory homeDirectory = new Directory("home");

            rootDirectory.add(binDirectory);
            rootDirectory.add(homeDirectory);

            binDirectory.add(new File("a.c", 100));
            File file = new File("a.java", 50);
            homeDirectory.add(file);
            // File file2 = new File("b.java", 30);
            // file.add(file2);

            rootDirectory.printList();
        } catch (FileTreatMentException e) {
            e.printStackTrace();
        }

    }
}
