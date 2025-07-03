package models;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas = new HashMap<>();

    public void criarConta(String nome, String cpf) {
        if (contas.containsKey(cpf)) throw new IllegalArgumentException("CPF já cadastrado.");
        contas.put(cpf, new Conta(nome, cpf));
    }

    public Conta obterConta(String cpf) {
        return contas.get(cpf);
    }
}
