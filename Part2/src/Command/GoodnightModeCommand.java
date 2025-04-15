package Command;

import java.util.List;

public class GoodnightModeCommand implements Command {
    private List<Command> commands;

    public GoodnightModeCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
