
/**
 * Escreva a descrição da classe Tabuleiro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Tabuleiro
{
    private char[][] tab;
    private int contadorJogadas;
    
    public Tabuleiro(){
        tab = new char[3][3];
        inicializa();
        contadorJogadas = 0;
    }
    
    public void inicializa(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                tab[i][j] = '.';
            }
        }
    }
    public int getContadorJogadas(){
        return contadorJogadas;
    }
    public boolean venceuEmColuna(char letra)
    {
        int cont;
        for(int col = 0; col<3; col++)
        {
            cont = 0;
            for(int lin = 0; lin<3; lin++)
            {
                if (tab[lin][col] == letra) cont++;
            }
            if (cont == 3) return true;
        }
        return false;
    }
    public boolean venceuEmDiagonal2(char letra)
    {
        int cont = 0;
        for(int lin = 0; lin<3; lin++)
        {
            for(int col = 0; col<3; col++)
            {
                if ((lin == col) && tab[lin][col] == letra) cont++;
            }
            if (cont == 3) return true;
        }
        return false;
    }
    public boolean venceuEmDiagonal(char letra)
    {
        int cont = 0;
        for(int lin = 0; lin<3; lin++)
        {
            if(tab[lin][lin] == letra) cont++;
        }
        if(cont == 3) return false;
        
        cont = 0;
        for(int i = 0, j = 2; i<3; i++, j--)
        {
            if(tab[i][j] == letra) cont++;
        }
        if(cont == 3) return true;
        return false;
    }
    public boolean alteraCelula(int lin, int col, char letra){
        if(celulaLivre(lin,col)) {
            tab[lin][col] = letra;
            contadorJogadas++;
            return true;
        }
        return false;
    }
    public boolean verificaVencedor(char letra){
        if(venceuEmLinha(letra)) return true;
        if(venceuEmColuna(letra)) return true;
        if(venceuEmDiagonal(letra)) return true;
        return false;
    }
    public boolean venceuEmLinha(char letra)
    {
        int cont;
        for(int lin = 0; lin<3; lin++)
        {
            cont = 0;
            for(int col = 0; col<3; col++)
            {
                if (tab[lin][col] == letra) cont++;
            }
            if (cont == 3) return true;
        }
        return false;
    }
    public boolean celulaLivre(int lin, int col){
        if(lin<0 || lin>2 || col<0 || col>2) return false;
        if(tab[lin][col]!='.') return false;
        return true;
    }
    public String toString(){
        String msg = "\n\n----- Jogo da Velha -----\n";
        msg = msg + "\t0\t1\t2\n";
        for(int i=0; i<3; i++){
            msg = msg + i + "\t";
            for(int j=0; j<3; j++){
                msg = msg + tab[i][j] + "\t";
            }
            msg = msg + "\n";
        }
        return msg;
    }
}
