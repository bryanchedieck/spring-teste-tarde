package chedieck.bryan.exemploGradle.model;

/**
 * Exemplo de Gradle
 * @author Bryan Chedieck
 * @Version
 * @since 14/04/2020 0 18:55
 */

public class Aluno {
    private String nome;
    private double nota;
    private double nota1;
    private double nota2;

    /**
     *
     * @param nome recebe o nome
     * @param nota recebe a primeira nota
     * @param nota1 recebe a segunda nota
     * @param nota2 recebe a terceira nota
     */

    public Aluno(String nome, double nota, double nota1, double nota2) {
        this.nome = nome;
        this.nota = nota;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     *
     * @return retorna a média aritmética do aluno
     */
    public double calcularMediaAritmetica() {return (this.nota + this.nota1 + this.nota2) /3; }

    /**
     *
     * @return retorna o conceito do aluno
     */
    public String calcularConceitoAluno() {
        if(this.calcularMediaAritmetica() >= 9 && calcularMediaAritmetica() <= 10) {
            return "entre 9 e 10 A";
        } else if(this.calcularMediaAritmetica() >= 7 && this.calcularMediaAritmetica() <= 8.9) {
            return "entre 7 e 8.9 B";
        } else if(this.calcularMediaAritmetica() >= 5 && this.calcularMediaAritmetica() <= 6.9) {
            return "entre 5 e 6.9";
        } else if(this.calcularMediaAritmetica() >= 0 && this.calcularMediaAritmetica() <= 4.9) {
            return "entre 0 e 4.9";
        }
        return "erro, conceito de 0 10";
    }

    @Override
    public String toString() {
        return "\nNome do aluno: " + this.nome
                + "\nPrimeira nota: " + this.nota
                + "\nSegunda nota: " + this.nota1
                + "\nSegunda nota: " + this.nota2
                + "\nMédia aritmética: " + this.calcularMediaAritmetica()
                + "\nConceito do aluno: " + this.calcularConceitoAluno();

    }
}


