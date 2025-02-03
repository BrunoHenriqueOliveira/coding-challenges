package com.github.BrunoHenriqueOliveira.codingchallenges.Beecrowd.iniciante;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        double notaC = scanner.nextDouble();
        double media = (notaA * 2 + notaB * 3 + notaC * 5) / 10;

        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();
    }
}
