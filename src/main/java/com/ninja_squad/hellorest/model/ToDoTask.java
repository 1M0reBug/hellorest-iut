package com.ninja_squad.hellorest.model;

public class ToDoTask {
    
    public String label;
    public String priority;
    
    public ToDoTask(){
        this.priority = "DEFAULT";
        this.label = "Default";
    }

    public ToDoTask(String label) {
        this.priority = "DEFAULT";
        this.label = label;
    }
}
