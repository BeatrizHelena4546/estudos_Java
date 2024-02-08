package exerciccio_contador;
public class teste {
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();

        System.out.println("Valor do contador: " + Contador.getValorContador());

        Contador.incrementarContador();

        System.out.println("Valor do contador após incrementar: " + Contador.getValorContador());

        Contador.zerarContador();

        System.out.println("Valor do contador após zerar: " + Contador.getValorContador());
    }
}
    





