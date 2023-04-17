public class ContaBancaria {
    private String numeroConta;
    private String agencia;
    private double saldo;

    public ContaBancaria(String numeroConta, String agencia, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo; 
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void extrato() {
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("O saldo atual é de: " + this.saldo);
    }

    public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            
        System.out.println("O valor sacado foi de: " + valor);
        System.out.println("Seu novo saldo é de: " + saldo);
        } else {
            System.out.println("Não existe nenhum saldo disponível, faça um depósito!");
        }
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("O valor depositado é de: " + valor);
        System.out.println("O novo saldo é de: " + saldo);
    }
}
