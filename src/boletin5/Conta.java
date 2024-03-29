package boletin5;

//@author IvanSteuerberg
public class Conta {

    private String nomeCliente;
    private String numeroConta;
    private double tipoInterese;
    private double saldo;

    public Conta() {
    }

    public Conta(String nomeCliente, String numeroConta, double tipoInterese, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.tipoInterese = tipoInterese;
        this.saldo = saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setTipoInteres(double tipoInterese) {
        this.tipoInterese = tipoInterese;
    }

    public double getTipoInterese() {
        return tipoInterese;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingreso(double dinero) {
        if (dinero>0)
          saldo += dinero;
        else 
          System.out.println("Error, el dinero debe ser una cantidad positiva");
    }

    public void reintegro(double dinero) {
        if (dinero>0)
            saldo -=(dinero);
        else
            System.out.println("Error, la cantidad debe ser positiva");
    }

    public void transferencia(Conta destinatario, double cantidad) {
        if (cantidad>0){
        reintegro(cantidad);
        destinatario.setSaldo(destinatario.getSaldo() + cantidad);
        }
        else
        System.out.println("Error, la cantidad debe ser positiva");
    }

    public void amosar() {
        System.out.println("O nome é " + nomeCliente + "\n O numero de conta é " + numeroConta
                + "\n O tipo de interese é " + tipoInterese + "\n O saldo é " + saldo);
    }

}
