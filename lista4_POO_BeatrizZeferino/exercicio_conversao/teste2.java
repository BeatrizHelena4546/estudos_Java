package exercicio_conversao;

public class teste2 {
    public static void main(String[] args) {
        double segundos = 120;
        double minutos = Conversao.segundosParaMinutos(segundos);
        System.out.println(segundos + " segundos são aproximadamente " + minutos + " minutos.");
        
        double horas = Conversao.minutosParaHoras(minutos);
        System.out.println(minutos + " minutos são aproximadamente " + horas + " horas.");
        
        double dias = Conversao.horasParaDias(horas);
        System.out.println(horas + " horas são aproximadamente " + dias + " dias.");
        
        // Continuar com as demais conversões conforme necessário
    }
}

