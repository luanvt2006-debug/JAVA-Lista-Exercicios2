package LuanVidalTeixeira;

import java.util.Scanner;

public class LVT27 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: LUAN VIDAL TEIXEIRA - RA : 0023480");
        System.out.println("* Classe LVT27 - Quantidade de números ímpares digitados");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int impares = 0;

        System.out.println("Digite 10 numeros:");

        while (contador < 10) {
            System.out.print("Numero " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero % 2 != 0) {
                impares++;
            }
            contador++;
        }

        System.out.println("Voce digitou " + impares + " numeros impares.");
        scanner.close();
    }
}
