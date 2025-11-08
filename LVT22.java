package LuanVidalTeixeira;

import java.util.Scanner;

public class LVT22 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: LUAN VIDAL TEIXEIRA - RA : 0023480");
        System.out.println("* Classe LVT22 - Soma de números até digitar zero");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite um numero (0 para parar):");
        numero = scanner.nextInt();

        while (numero != 0) {
            soma += numero;
            System.out.println("Digite outro numero (0 para parar):");
            numero = scanner.nextInt();
        }

        System.out.println("A soma e: " + soma);
        scanner.close();
    }
}
