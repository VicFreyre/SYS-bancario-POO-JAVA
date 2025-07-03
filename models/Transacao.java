package models;

import java.time.LocalDateTime;

public class Transacao {
    private String tipo;
    private double valor;
    private String destino;
    private LocalDateTime data;

    public Transacao(String tipo, double valor, String destino) {
        this.tipo = tipo;
        this.valor = valor;
        this.destino = destino;
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        if (destino != null) {
            return String.format("[%s] %s de R$%.2f para %s", data, tipo, valor, destino);
        }
        return String.format("[%s] %s de R$%.2f", data, tipo, valor);
    }
}
