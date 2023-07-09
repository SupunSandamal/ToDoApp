package com.supun.todoapp.model;

public class Todo extends TaskId {
    private String task, due;
    private int status;

    public String getTask() {
        return task;
    }

    public String getDue() {
        return due;
    }

    public int getStatus() {
        return status;
    }
}
