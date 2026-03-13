package Jogo;

public class Arqueiro extends Personagem{

    public String arma;

    public Arqueiro(String nome) {
        super(nome);
        this.classe = "arqueiro";
        this.nivel = (2);
        this.arma = "Arco Longo";
    }

    @Override
    public String toString() {

        String conteudoPersonagem = super.toString();
        String informacaoArqueiro = String.format(" - Arma: %s", arma);

        return conteudoPersonagem + informacaoArqueiro;

    }

    @Override
    public void atacar () {
        System.out.println("O arqueiro atirou com " + arma);
    }
}
