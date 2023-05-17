package execicio_Lampada;

public class Lampada {
	String tipo, cor;
	int potencia;
	double preco;
	
	public Lampada(String tipo, String cor, int potencia, double preco) {
		super();
		this.tipo = tipo;
		this.cor = cor;
		this.potencia = potencia;
		this.preco = preco;
	}

	public String ligar() {
		return "Ligada";
	}
	
	public String desligar() {
		return "Desligada";
	}
}
