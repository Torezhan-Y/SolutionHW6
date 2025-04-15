package Main;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command setThermostat = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.assignCommandToSlot("light", turnOnLight);
        remote.assignCommandToSlot("thermostat", setThermostat);

        System.out.println("--- Execute Commands ---");
        remote.pressButton("light");
        remote.pressButton("thermostat");

        System.out.println("\n--- Undo Last Command ---");
        remote.undoButton();

        System.out.println("\n--- Execute Commands Again ---");
        remote.pressButton("thermostat");
    }
}
