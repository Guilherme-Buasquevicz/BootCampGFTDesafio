package com.gft.dio;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta corrente ");
        super.imprimirInfosComuns();
    }

    @Override
    public void emprestimo() {
        if(super.saldo >= 20000){
            System.out.println("Voce pode fazer um emprestimo de 1000R$ ");
        }else {
            System.out.println("Voce precisa ter saldo maior que 20000");
        }
    }
}
