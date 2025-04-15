package Remote;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemoteControl {
    private Map<String, Command> commandSlots = new HashMap<>();
    private Command lastExecutedCommand;

    public void assignCommandToSlot(String slot, Command command) {
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
}
