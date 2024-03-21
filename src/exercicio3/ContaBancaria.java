package exercicio3;

import java.util.Scanner;

public class ContaBancaria {
    String titular;

    double saldo;

    public void deposito(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Saldo atualizado é:" + saldo);

    }
    public void saque(double valor){
        if (saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com suscesso, seu novo saldo é de R$" + this.saldo);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}