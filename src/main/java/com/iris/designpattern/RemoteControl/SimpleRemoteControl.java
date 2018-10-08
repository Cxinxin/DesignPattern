package com.iris.designpattern.RemoteControl;

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl( ) {
    }

    public void setCommand(Command command){
        this.slot=command;
    }

    public void buttonWasPressed(){
        slot.excute();
    }
}
