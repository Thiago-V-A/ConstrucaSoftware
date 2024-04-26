package com.github.thiago_v_a.ConstrucaSoftware.atividade08;

// Classe SaldoInsuficienteException
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

// Classe ContaBancaria
public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar R$ " + valor);
        }
        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }
}

// Classe de teste (executável)
class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        try {
            conta.depositar(500.0);
            conta.sacar(700.0);
            conta.sacar(1000.0); // Tentativa de sacar mais do que o saldo disponível
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
