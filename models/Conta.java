package models;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String nome;
    private String cpf;
    private double saldo;
    private double investimentos;
    private List<Transacao> historico;

    public Conta(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
        this.investimentos = 0.0;
        this.historico = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor de depósito inválido");
        saldo += valor;
        historico.add(new Transacao("Depósito", valor, null));
    }

    public void sacar(double valor) {
        if (valor <= 0 || valor > saldo) throw new IllegalArgumentException("Saldo insuficiente ou valor inválido");
        saldo -= valor;
        historico.add(new Transacao("Saque", valor, null));
    }

    public void transferir(double valor, Conta destino) {
        if (valor <= 0 || valor > saldo) throw new IllegalArgumentException("Saldo insuficiente ou valor inválido");
        saldo -= valor;
        destino.saldo += valor;
        historico.add(new Transacao("PIX", valor, destino.nome));
        destino.historico.add(new Transacao("PIX Recebido", valor, this.nome));
    }

    public void investir(double valor) {
        if (valor <= 0 || valor > saldo) throw new IllegalArgumentException("Saldo insuficiente ou valor inválido");
        saldo -= valor;
        investimentos += valor;
        historico.add(new Transacao("Investimento", valor, null));
    }

    public void extrato() {
        System.out.println("Extrato de " + nome + ":");
        for (Transacao t : historico) {
            System.out.println(t);
        }
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
        System.out.printf("Investimentos: R$%.2f%n%n", investimentos);
    }
}
