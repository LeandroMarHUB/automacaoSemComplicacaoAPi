package transferencia;

public class Conta {

    private String agencia;
    private String numeroConta;
    private double saldo;
    private String proprietario;

    public Conta(String agencia, String numeroConta, double saldo, String proprietario) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.proprietario = proprietario;
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

    public String getProprietario() {
        return proprietario;
    }

    public void realizaDeposito(double valor){
        saldo += valor;
    }

    public boolean realizarSaque(double valor){
        if (valor > saldo){
            return false;
        }
        saldo -= valor;
        return true;
    }
    public boolean realizarTransferencia(double valor, Conta destino){
        if(realizarSaque(valor)){
            destino.realizaDeposito(valor);
            return true;
        }
        return false;
    }
}
