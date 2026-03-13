package Jogo;

public class Personagem {
    public String nome;
    public String classe;
    public int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 1;
    }

    @Override
    public String toString() {
        String informacoes = String.format(" %s(nivel: %d) - Classe %s", nome, nivel, classe);

        return informacoes;
    }

    public void atacar () {
        System.out.println("o personagem atacou");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}