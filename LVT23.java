package LuanVidalTeixeira;

import java.util.Scanner;

public class LVT23 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: LUAN VIDAL TEIXEIRA - RA : 0023480");
        System.out.println("* Classe LVT23 - Senha correta");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java123";
        String tentativa;

        System.out.println("Digite a senha:");
        tentativa = scanner.nextLine();

        while (!tentativa.equals(senhaCorreta)) {
            System.out.println("Senha incorreta.");
            System.out.println("Digite a senha:");
            tentativa = scanner.nextLine();
        }

        System.out.println("Senha correta! Acesso permitido.");
        scanner.close();
    }
}
