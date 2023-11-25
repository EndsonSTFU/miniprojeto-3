import java.util.Scanner;

public class Capitulo {
    String texto;
    String escolha1;
    String escolha2;
    Personagem Finn;
    Personagem Jake;
    int incrementoFinn;
    int incrementoJake;
    Scanner aventura;

    Capitulo(String texto,
             String escolha1,
             String escolha2,
             Personagem Finn, 
             Personagem Jake,
             int incrementoFinn,
             int incrementoJake,
             Scanner aventura)
            
    {
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.Finn = Finn;
        this.Jake = Jake;
        this.incrementoJake = incrementoJake;
        this.incrementoFinn = incrementoFinn;
        this.aventura = aventura;
    }


    void mostrar() {
        System.out.println(texto);
        System.out.println("- " + escolha1);
        System.out.println("- " + escolha2);
        Jake.atualizarVida(incrementoJake);
        Finn.atualizarVida(incrementoFinn);
    }


    int escolher() {
        int resultado = 0;
        boolean escolhaCorreta = false;

        while (!escolhaCorreta) {
            String escolha = aventura.nextLine();
            if (escolha.equals(escolha1)) {
                escolhaCorreta = true;
                resultado = 1;
            } else if (escolha.equals(escolha2)) {
                escolhaCorreta = true;
                resultado = 2;
            } else {
                escolhaCorreta = false;
                System.out.println("Escolha apenas uma das opções indicadas.");
            }
        }


        return resultado;
    }
}