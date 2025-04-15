package Remote;

import Command.Command;
import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemoteControl {
    private Map<String, Command> commandSlots = new HashMap<>();
    private Command lastExecutedCommand;

    public void addCommand(String slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commandSlots.get(slot);
        if (command != null) {
            command.execute();
            lastExecutedCommand = command;
        }
    }

    public void undoButton() {
        if (lastExecutedCommand != null) {
            lastExecutedCommand.undo();
        }
    }

    public void redoButton() {
        if (lastExecutedCommand != null) {
            lastExecutedCommand.execute();
        }
    }
}