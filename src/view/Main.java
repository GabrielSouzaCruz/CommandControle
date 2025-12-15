package view;

import model.command.Command;
import model.command.LigarArCondicionadoCommand;
import model.command.LigarLuzCommand;
import model.command.LigarSomCommand;
import model.command.MacroCommand;
import model.invoker.ControleRemoto;
import model.receiver.ArCondicionado;
import model.receiver.Luz;
import model.receiver.Som;

public class Main {

    public static void main(String[] args) {

        Luz luz = new Luz();
        Som som = new Som();
        ArCondicionado ar = new ArCondicionado();

        Command LigarLuz = new LigarLuzCommand(luz);
        Command ligarSom = new LigarSomCommand(som);
        Command ligarAr = new LigarArCondicionadoCommand(ar);

        Command modoCinema = new MacroCommand(
                new Command[]{LigarLuz, ligarSom, ligarAr}
        );

        ControleRemoto controle = new ControleRemoto();
        controle.setCommand(modoCinema);

        controle.pressionarBotao();
        controle.pressionarDesfazer();
    }
}
