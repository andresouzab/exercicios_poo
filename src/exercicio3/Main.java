package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria santander = new ContaBancaria();
        santander.titular = "João";
        santander.saldo = 50;
        System.out.printf("Informe o valor do deposito:");
        Scanner leia = new Scanner(System.in);
        double valor = leia.nextDouble();
        santander.deposito(valor);
        System.out.println("Informe o valor do saque:");
        valor = leia.nextDouble();
        santander.saque(valor);
    }
}
