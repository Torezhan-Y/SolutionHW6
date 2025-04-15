package Main;

import Command.*;
import Device.*;
import Remote.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        Door door = new Door();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command turnOffLight = new TurnOffLightCommand(light);
        Command setThermostat = new SetThermostatCommand(thermostat, 22);
        Command lockDoor = new LockDoorCommand(door);

        GoodnightModeCommand goodnightMode = new GoodnightModeCommand(Arrays.asList(turnOffLight, setThermostat, lockDoor));

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.addCommand("goodnight", goodnightMode);
        remote.addCommand("turnOnLight", turnOnLight);
        remote.addCommand("turnOffLight", turnOffLight);
        remote.addCommand("setThermostat", setThermostat);
        remote.addCommand("lockDoor", lockDoor);

        // Execute commands
        System.out.println("Executing Goodnight Mode...");
        remote.pressButton("goodnight");

        // Undo last command
        System.out.println("\nUndo last command");
        remote.undoButton();

        // Redo last command
        System.out.println("\nRedo last command");
        remote.redoButton();
    }
}
