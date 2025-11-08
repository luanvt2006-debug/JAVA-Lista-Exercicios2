package LuanVidalTeixeira;

import java.util.Scanner;

public class LVT32 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: LUAN VIDAL TEIXEIRA - RA : 0023480");
        System.out.println("* Classe LVT32 - Tabuada de um número");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para ver a tabuada: ");
        int numero = scanner.nextInt();
        int i = 1;

        System.out.println("Tabuada do " + numero + ":");
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);

        scanner.close();
    }
}
