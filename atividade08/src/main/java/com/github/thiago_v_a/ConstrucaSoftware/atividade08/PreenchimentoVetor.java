package com.github.thiago_v_a.ConstrucaSoftware.atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PreenchimentoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int indice = 0;

        try {
            while (true) {
                System.out.print("Digite um valor inteiro (0 para parar): ");
                int valor = scanner.nextInt();

                if (valor == 0) {
                    vetor[indice] = valor;
                    break;
                }

                vetor[indice] = valor;
                indice++;

                if (indice >= 10) {
                    throw new ArrayIndexOutOfBoundsException("O vetor está cheio (10 posições)");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite apenas valores inteiros.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: O vetor está cheio (10 posições).");
        }

        System.out.println("\nValores digitados:");
        for (int i = 0; i < indice; i++) {
            System.out.println(vetor[i]);
        }
    }
}

