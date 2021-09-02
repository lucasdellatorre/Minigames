
/**
 * Escreva a descrição da classe JogoDaVelha aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
import java.util.Random;
public class JogoDaVelha
{
    public static void main(String args[]){
       // Scanner in = new Scanner(System.in);
        Random gera = new Random();
        Tabuleiro jogo = new Tabuleiro();
        char usuario = 'X', computador = 'O';
        int cont;
        System.out.println("\fEscolhendo entre X e O...");
        int opcao = gera.nextInt(2);
        if(opcao==0){
            computador = 'X';
            usuario = 'O';
        }
        
        System.out.println("Iniciando o jogo.");
        System.out.println("Computador: " + computador);
        System.out.println("Usuario: " + usuario);
        
        System.out.println("\nVez do Usuario...");
        System.out.println(jogo);
        jogadaUsuario(jogo, usuario);
        
        for(int t=1; t<=4; t++)
        {
            System.out.println("\nVez do Computador...");
            System.out.println(jogo);
            jogadaComputador(jogo,computador);
            if(jogo.verificaVencedor(computador)){
                System.out.println(jogo);
                System.out.println("Computador venceu!");
                break;
            }
            System.out.println("\nVez do Usuario...");
            System.out.println(jogo);
            jogadaUsuario(jogo, usuario);
            if(jogo.verificaVencedor(usuario)){
                System.out.println(jogo);
                System.out.println("Usuario venceu!");
                break;
            }
        }
        if(jogo.getContadorJogadas() == 9) System.out.println("Empate");
    }
    private static void jogadaUsuario(Tabuleiro jogo,char letra){
        Scanner in = new Scanner(System.in);
        int lin, col;        
        System.out.print("Informe corretamente a linha e a coluna da celula da sua jogada: ");
        lin = in.nextInt();
        col = in.nextInt();
        while(jogo.alteraCelula(lin,col,letra)==false){
            System.out.println("ERRO: Coordenadas incorretas ou celula ocupada");
            System.out.print("Informe corretamente a linha e a coluna da celula da sua jogada: ");
            lin = in.nextInt();
            col = in.nextInt();
        }      
    }
    
    private static void jogadaComputador(Tabuleiro jogo,char letra){
        Random gera = new Random();
        int lin, col;
        do{
            lin = gera.nextInt(3);
            col = gera.nextInt(3);
        }while(jogo.alteraCelula(lin,col,letra)==false);
    }
}
