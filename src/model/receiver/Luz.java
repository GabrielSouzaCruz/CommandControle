package model.receiver;

public class Luz {
	private int potencia;
	
	public Luz(int potencia) {
		this.potencia = potencia;
	}
	
	public void AumentarPotencia() {
		potencia += 1;
		System.out.println("Potencia da Luz: " + this.potencia);
	}
	
	public void DiminuirPotencia() {
		potencia = 50;
		potencia -= 1;
		System.out.println("Potencia da Luz: " + this.potencia);
	}

    public void ligar() {
        System.out.println("Luz LIGADA");
    }

    public void desligar() {
        System.out.println("Luz DESLIGADA");
    }
}

