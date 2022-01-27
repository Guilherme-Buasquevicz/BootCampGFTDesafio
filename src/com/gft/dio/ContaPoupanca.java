package com.gft.dio;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" Extrato conta poupanca ");
        super.imprimirInfosComuns();
    }

    @Override
    public void emprestimo() {
        if(super.saldo >= 10000){
            System.out.println("Voce pode fazer um emprestimo de 5000R$ ");
        }else {
            System.out.println("Voce precisa ter saldo maior que 10000");
        }
    }

}
