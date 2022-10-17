package desafio.banco.de.dados.org;

import java.util.List;

public class Banco {
    public String nome;
    public static List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}