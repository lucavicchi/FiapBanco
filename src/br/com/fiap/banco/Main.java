package br.com.fiap.banco;

public class Main {
    class Teste {
        public static void main(String[] args) {

            Conta cc = new Conta(numero);
            cc.depositar(50);
            cc.setAgencia(123);
            cc.setNumero(321);

            cc.depositar(100);

            System.out.println(cc.getSaldo());

            Conta poupanca = new Conta(111, 222, 1000);

            poupanca.retirar(50);

            System.out.println(poupanca.getSaldo());

            if (cc instanceof ContaCorrente) {
                System.out.println("cc é do tipo ContaCorrente");
            } else {
                System.out.println("cc NÃO é do tipo ContaCorrente");
            }
        }
    }
}
