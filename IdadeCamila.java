package com.mycompany.idadecamila;
import java.util.Scanner;
/**
 * @author Talita
 */
public class IdadeCamila {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a idade de Camila?\nCibele, Camila e Celeste são três irmãs inseparáveis.\nSabemos que Cibele nasceu antes de Camila e Celeste nasceu despois de Camila.\nInforme três números para representar as idades delas.\n");
        System.out.println("Informe o primeiro número: ");
        num1 = ler.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = ler.nextInt();
        System.out.println("Informe o terceiro número: ");
        num3 = ler.nextInt();

        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            System.out.println("A idade de Camila é: " + num1);
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            System.out.println("A idade de Camila é: " + num2);
        } else if ((num3 > num1 && num3 < num2) || (num3 < num1 && num3 > num2)) {
            System.out.println("A idade de Camila é: " + num3);
        } else {
            System.out.println("Os números informados são inválidos.");
        }
    }
}
