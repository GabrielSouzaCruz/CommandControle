package model.command;

import model.receiver.ArCondicionado;

public class LigarArCondicionadoCommand implements Command {

    private ArCondicionado ar;

    public LigarArCondicionadoCommand(ArCondicionado ar) {
        this.ar = ar;
    }

    public void execute() {
        ar.ligar();
    }

    public void undo() {
        ar.desligar();
    }
}
