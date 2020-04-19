package chedieck.bryan.exemploGradleSemLombok.model;

/**
 * @author Bryan Chedieck Pires
 * @version 1.0
 * @since 15/04/2020
 */
public class Cliente {

    private String nome;

    /**
     *
     * @param nome recebe o nome
     */

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
