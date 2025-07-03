import models.Banco;
import models.Conta;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.criarConta("Alice", "123");
        banco.criarConta("Bob", "456");

        Conta alice = banco.obterConta("123");
        Conta bob = banco.obterConta("456");

        alice.depositar(1000);
        alice.sacar(200);
        alice.transferir(300, bob);
        alice.investir(400);

        alice.extrato();
        bob.extrato();
    }
}
