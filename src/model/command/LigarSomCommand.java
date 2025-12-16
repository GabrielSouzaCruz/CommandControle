package model.command;

import model.receiver.Som;

public class LigarSomCommand implements Command {

    private Som som;

    public LigarSomCommand(Som som) {
        this.som = som;
    }

    public void execute() {
        som.ligar();
    }

    public void undo() {
        som.desligar();
    }
}

