package Device;

public class Thermostat {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public void revertToPreviousTemperature() {
        System.out.println("[Thermostat] Reverting to previous temperature");
    }
}
