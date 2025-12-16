package view;

import model.Pessoa;
import model.invoker.ControleRemoto;

public class Main {

    public static void main(String[] args) {

        ControleRemoto controle = new ControleRemoto();
        Pessoa pessoa = new Pessoa("Gabriel", controle);

        pessoa.assistirFilme();
        pessoa.desfazerAcao();
    }
}
