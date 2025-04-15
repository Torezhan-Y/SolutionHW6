package Command;

import Device.Door;

public class UnlockDoorCommand implements Command {
    private Door door;

    public UnlockDoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.unlock();
    }

    @Override
    public void undo() {
        door.lock();
    }
}
