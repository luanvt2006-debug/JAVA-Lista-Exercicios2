package LuanVidalTeixeira;

import java.util.Scanner;

public class LVT33 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: LUAN VIDAL TEIXEIRA - RA : 0023480");
        System.out.println("* Classe LVT33 - Menu com opção de sair");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opcao: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Voce escolheu a mensagem!");
            }

        } while (escolha != 2);

        System.out.println("Saindo...");
        scanner.close();

    }
}
