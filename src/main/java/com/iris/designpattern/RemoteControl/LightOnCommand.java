package com.iris.designpattern.RemoteControl;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }
}
