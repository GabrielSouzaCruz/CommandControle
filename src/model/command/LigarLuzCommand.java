package model.command;

import model.receiver.Luz;

//Comando concreto
public class LigarLuzCommand implements Command {
 private Luz luz;

 public LigarLuzCommand(Luz luz) {
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
