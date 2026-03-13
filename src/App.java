import Jogo.Arqueiro;
import Jogo.Personagem;

public class App {

    public static void main(String[] args) {

        Personagem personagem = new Personagem("Joao");
        System.out.println(personagem);

        Arqueiro arqueiro = new Arqueiro("Ramza");
        System.out.println(arqueiro);

        arqueiro.atacar();
        personagem.atacar();
    }
}