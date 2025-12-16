package model.invoker;

import java.util.Stack;

import model.command.Command;

public class ControleRemoto {

 private Command slot;
 private Stack<Command> historico = new Stack<>();

 public void setCommand(Command command) {
     this.slot = command;
 }

 public void pressionarBotao() {
     slot.execute();
     historico.push(slot);
 }

 public void pressionarDesfazer() {
     if (!historico.isEmpty()) {
         historico.pop().undo();
     }
 }
}

