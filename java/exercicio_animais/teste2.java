package exercicio_animais;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cavalo cavalo = new Cavalo();
		Cachorro cachorro = new Cachorro();
		Papagaio papagaio = new Papagaio();
		Gato gato = new Gato();
		Scanner scan = new Scanner(System.in);
		int animal;
		
		System.out.println("Cavalo		: 1");
		System.out.println("Cachorro	: 2");
		System.out.println("gato		: 3");
		System.out.println("papagaio	: 4");
		System.out.println("Qual animal?: ");
		animal = scan.nextInt();
		
		switch(animal) {
			case 1:
				System.out.println(cavalo.emitirsom());
				break;
			case 2:
				System.out.println(cachorro.emitirsom());
				break;
			case 3:
				System.out.println(gato.emitirsom());
				break;
			case 4:
				System.out.println(papagaio.emitirsom());
				break;
		}
		
		scan.close();
	}

}
