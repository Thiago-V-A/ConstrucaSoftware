package com.github.thiago_v_a.ConstrucaSoftware.atividade08;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PreenchimentoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<>();

        try {
            while (true) {
                System.out.print("Digite um valor inteiro (0 para parar): ");
                int valor = scanner.nextInt();

                if (valor == 0) {
                    vetor.add(valor);
                    break;
                }

                if (vetor.size() >= 10) {
                    throw new ArrayIndexOutOfBoundsException("O vetor está cheio (10 posições)");
                }

                vetor.add(valor);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite apenas valores inteiros.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: O vetor está cheio (10 posições).");
        }

        System.out.println("\nValores digitados:");
        for (int valor : vetor) {
            System.out.println(valor);
        }
    }
}