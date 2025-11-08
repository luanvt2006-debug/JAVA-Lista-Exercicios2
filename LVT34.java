package LuanVidalTeixeira;

import java.util.Scanner;

public class LVT34 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: LUAN VIDAL TEIXEIRA - RA : 0023480");
        System.out.println("* Classe LVT34 - Pedir senha até acertar");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int senhaDigitada;
        int senhaCorreta = 1111;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextInt();

            if (senhaDigitada != senhaCorreta) {
                System.out.println("Senha incorreta.");
            }

        } while (senhaDigitada != senhaCorreta);

        System.out.println("Acesso liberado!");
        scanner.close();
    }
}
