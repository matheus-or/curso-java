package br.com.matheus.model;

public class Conta {

    private int numeroConta;
    private String nome;
    private double valor;

    public Conta() {
    }

    public Conta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.valor = 0.00;
    }

    public Conta(int numeroConta, String nome, double valor) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.valor = valor;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void deposito(double valor) {
        this.valor += valor;
    }

    public void saque(double valor) {
        this.valor -= valor - 5.00;
    }

    public String toString() {
        return "Account " + this.numeroConta + ", Holder: " + this.nome + ", Balance: $ " + String.format("%.2f", this.valor);
    }

}
