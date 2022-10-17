package desafio.banco.de.dados.org;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(new Cliente("José"));
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(new Cliente("Marcos"));

        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
