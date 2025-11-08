package LuanVidalTeixeira;

import java.util.Scanner;

public class LVT04 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: LUAN VIDAL TEIXEIRA - RA : 0023480");
        System.out.println("* Classe LVT04 - Pode votar?");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Voto proibido.");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
            System.out.println("Voto opcional.");
        } else {
            System.out.println("Voto obrigatório.");
        }

        scanner.close();
    }
}
