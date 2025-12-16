package model.command;

import model.receiver.Luz;

//Comando concreto
public class PotenciaLuzCommand implements Command {
 private Luz luz;

 public PotenciaLuzCommand(Luz luz) {
     this.luz = luz;
 }

 @Override
 public void execute() {
	 luz.AumentarPotencia();
 }

 @Override
 public void undo() {
     luz.DiminuirPotencia();
 }
}
