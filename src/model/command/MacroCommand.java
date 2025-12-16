package model.command;

public class MacroCommand implements Command {

    private Command[] comandos;

    public MacroCommand(Command[] comandos) {
        this.comandos = comandos;
    }

    @Override
    public void execute() {
        System.out.println("--- Iniciando Modo Cinema ---");
        for (Command c : comandos) {
            c.execute();
        }
    }

    @Override
    public void undo() {
        System.out.println("\n--- Desfazendo Modo Cinema ---");
        for (int i = comandos.length - 1; i >= 0; i--) {
            comandos[i].undo();
        }
    }
}
