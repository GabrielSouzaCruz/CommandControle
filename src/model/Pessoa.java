package model;

import model.command.Command;
import model.command.DesligarLuzCommand;
import model.command.LigarArCondicionadoCommand;
import model.command.LigarSomCommand;
import model.command.MacroCommand;
import model.invoker.ControleRemoto;
import model.receiver.ArCondicionado;
import model.receiver.Luz;
import model.receiver.Som;

public class Pessoa {
	private String nome;
	private ControleRemoto controle;
	
	public Pessoa(String nome, ControleRemoto controle) {
		this.nome = nome;
		this.controle = controle;
	}
	
	public void assistirFilme() {
		System.out.println(nome + " escolhe assistir um filme.");
		Command modoCinema = new MacroCommand(new Command[] {
				new DesligarLuzCommand(new Luz(0)),
				new LigarSomCommand(new Som()),
				new LigarArCondicionadoCommand(new ArCondicionado())
		});
		controle.setCommand(modoCinema);
		controle.pressionarBotao();
	}
	
	public void desfazerAcao() {
		System.out.println("\n"+ nome + " terminou de assistir o filme.");
		controle.pressionarDesfazer();
	}
	
}
