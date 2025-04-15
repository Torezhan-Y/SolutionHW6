package Device;

public class Thermostat {
    private int temperature = 20; // Изначальная температура

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }

    public void revertTemperature(int previousTemp) {
        this.temperature = previousTemp;
        System.out.println("[Thermostat] Reverting to previous temperature: " + this.temperature + "°C");
    }
}