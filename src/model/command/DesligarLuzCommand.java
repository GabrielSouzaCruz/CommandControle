package model.command;

import model.receiver.Luz;

//Comando concreto
public class DesligarLuzCommand implements Command {
 private Luz luz;

 public DesligarLuzCommand(Luz luz) {
     this.luz = luz;
 }

 @Override
 public void execute() {
	 luz.desligar();
 }

 @Override
 public void undo() {
     luz.ligar();
 }
}
