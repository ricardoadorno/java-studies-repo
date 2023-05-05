
class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

}

class Correntista {
    private String cpf;
    private String nome;

    public Correntista(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String toString() {
        return this.cpf + " - " + this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}

class Conta {
    private int numeroDeConta;
    private double saldo;
    private Data dataDeAbertura;
    private Correntista[] correntista;

    public Conta(int numeroDeConta, Data dataDeAbertura, Correntista[] correntistas, double monto) {
        this.numeroDeConta = numeroDeConta;
        this.dataDeAbertura = dataDeAbertura;
        this.correntista = correntistas;
        this.saldo = monto;
    }

    public String toString() {
        String resposta = "";
        for (int i = 0; i < correntista.length; i++) {
            resposta += "\nCorrentista " + (i + 1) + ": " + correntista[i]
                    + "\nSaldo: " + saldo
                    + "\nData de abertura: " + dataDeAbertura
                    + "\nNúmero da conta: " + numeroDeConta + "\n"
                    + "--------------------------\n";

        }
        return resposta;
    }

    public boolean fazerDeposito(double monto) {
        if (monto >= 0) {
            saldo += monto;
            return true;
        } else {
            return false;
        }
    }

    public boolean fazerSaque(double monto) {
        if (monto < saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    public boolean fazerTransferencia(Conta destino, double monto) {
        if (this.fazerSaque(monto) == true) {
            destino.fazerDeposito(monto);
            return true;
        } else {
            return false;
        }
    }

}

public class RegistroDeContas {

    public static void main(String[] args) {

        Data d = new Data(1, 1, 2000);
        Correntista c1 = new Correntista("123", "João");
        Correntista c2 = new Correntista("456", "Maria");

        Correntista[] correntistas = new Correntista[2];
        correntistas[0] = c1;
        correntistas[1] = c2;

        Conta conta1 = new Conta(1, d, correntistas, 2000);
        Conta conta2 = new Conta(2, d, correntistas, 1000);

        conta1.fazerDeposito(100);
        System.out.println(conta1);
        System.out.println(conta2);

    }

}
