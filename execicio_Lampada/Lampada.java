package execicio_Lampada;

public class Lampada {
    private boolean ligada;

    public Lampada(boolean ligada) {
		super();
		this.ligada = ligada;
	}

	public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mudarEstado() {
        ligada = !ligada;
    }

    public void mostrarEstado() {
        String estado = ligada ? "ligada" : "desligada";
        System.out.println("A lampada esta " + estado);
    }
}
