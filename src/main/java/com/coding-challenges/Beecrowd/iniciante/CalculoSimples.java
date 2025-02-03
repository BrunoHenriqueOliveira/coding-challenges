package com.rocketseat.createUrlShortner.Beecrowd.iniciante;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1 = scanner.nextInt();
        int numeroPecas1 = scanner.nextInt();
        double valorUnitarioPeca1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int numeroPecas2 = scanner.nextInt();
        double valorUnitarioPeca2 = scanner.nextDouble();
        double valorTotal = numeroPecas1 * valorUnitarioPeca1 + numeroPecas2 * valorUnitarioPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
        scanner.close();
    }
}
