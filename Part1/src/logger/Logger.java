package logger;

public class Logger {
    public static void log(String handler, String message) {
        System.out.println("[Logger] " + handler + ": " + message);
    }
}
