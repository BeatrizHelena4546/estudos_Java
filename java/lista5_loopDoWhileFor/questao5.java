import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String codigo, senha;

        System.out.println("Digite o seu codigo : ");
        codigo = scan.nextLine();

        System.out.println("Digite sua senha : ");
        senha = scan.nextLine();

        while(senha.equals(codigo)){
            System.out.println("ERRO : O senha não pode ser igual ao codigo");
            System.out.println("Digite o seu codigo : ");
            codigo = scan.nextLine();

            System.out.println("Digite sua senha : ");
            senha = scan.nextLine();
       }

        System.out.println("Código do usuário: " + codigo);
        System.out.println("Senha do usuário: " + senha);
        scan.close();
   }
}