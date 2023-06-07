package agenda;

import java.util.Objects;

/**
 * Representa um contato de uma agenda telefônica.
 * Cada contato é identificado pelo seu nome e sobrenome além de possuir um telefone.
 * 
 * @author joeverton bento de sousa
 */
public class Contato {
    
    private String nome;
    private String sobrenome;
    private String telefone;

    /**
     * Construtor da classe Contato. Cria um contato, a partir do nome, sobrenome e telefone.
     * Se os parâmetros nome e telefone forem nulos ou estiverem em branco. Ocorrerá uma exceção.
     * @param nome
     * @param sobrenome
     * @param telefone
     */
    public Contato(String nome, String sobrenome, String telefone) {
        if (nome == null || nome.isBlank() || telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("CONTATO INVÁLIDO");
        }
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    /**
     * Retorna o nome do contato.
     * @return nome do contato.
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Retorna o sobrenome do contato.
     * @return sobrenome do contato.
     */
    public String getSobrenome() {
        return sobrenome;
    }
    
    /**
     * Retorna o telefone do contato.
     * @return telefone do contato.
     */
    public String getTelefone() {
        return telefone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }

    /**
     * Método que verifica se dois contatos são iguais. Comparando seus nomes e sobrenomes.
     * 
     * @return Retorna true se os contatos forem iguais, caso contrário retorna false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        return Objects.equals(nome, other.nome) && Objects.equals(sobrenome, other.sobrenome);
    }

    /**
     * Retorna uma String que representa o contato. Apresentando o nome e sobrenome.
     * A representação está no seguinte formato: "Nome Sobrenome".
     * @return String representando o contato
     */
    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
    
}
