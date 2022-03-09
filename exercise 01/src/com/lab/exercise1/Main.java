package com.lab.exercise1;

public class Main {

    public static void main(String[] args) {
	    Light livingRoomLight = new LivingRoomLight();
        Light kitchenLight = new KitchenLight();

        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        lightOnCommand.execute();
        Command lightOffCommand = new LightOffCommand(livingRoomLight);
        lightOffCommand.execute();

        Command lightOnCommand1 = new LightOnCommand(kitchenLight);
        lightOnCommand1.execute();
        Command lightOffCommand1 = new LightOffCommand(kitchenLight);
        lightOffCommand1.execute();
    }
}
