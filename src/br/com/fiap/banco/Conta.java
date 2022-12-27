package br.com.fiap.banco;
    /**
     * Classe que abstrai uma Conta Bancária
     * @author lucavicchi
     * @version 1.0
     */
    public class Conta {
        /**
         * Número da conta
         */
        int numero;

        /**
         * Número da Agência
         */
        int agencia;

        /**
         * Saldo da Conta
         */
        double saldo;

        public Conta(int numero) {

        }

        public Conta(int numero, int agencia, double saldo) {
            //this.setNumero(numero);
            //this.setAgencia(agencia);
            //this.setSaldo(saldo);
        }

        /**
         * Deposita um valor ao saldo da conta
         *
         * @param valor Valor a ser depositado
         */
        public void depositar(double valor) {
            saldo = saldo + valor;
        }

        /**
         * Retira um valor do saldo da conta
         *
         * @param valor Valor a ser retirado
         */

        public void retirar(double valor) {
            saldo = saldo - valor;
        }

        public class ContaCorrente extends Conta {
            public ContaCorrente() {
                super(numero);
            }

            @Override
            public void retirar(double valor) {
                valor = valor + 10;
                super.retirar(valor);
            }

            public int getNumero() {
                return numero;
            }

            public void setNumero(int numero) {
                this.numero = numero;
            }

            public int getAgencia() {
                return agencia;
            }

            public void setAgencia(int agencia) {
                this.agencia = agencia;
            }

            public double getSaldo() {
                return saldo;
            }

            public void SetSaldo(double saldo) {
                this.saldo = saldo;
            }
        }
    }
