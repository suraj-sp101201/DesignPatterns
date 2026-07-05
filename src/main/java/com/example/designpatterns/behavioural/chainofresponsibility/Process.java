package com.example.designpatterns.behavioural.chainofresponsibility;

abstract class Process {

    protected Process next;

    abstract void handle();
    public Process setNext(Process process) {
        this.next = process;
        return next;
    }
}
