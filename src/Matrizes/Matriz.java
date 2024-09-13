package Matrizes;

public class Matriz {
    private int[][] matriz;
    private int linha;
    private int coluna;

    public Matriz(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
        this.matriz = new int[linha][coluna];
    }

    public void preencherMatriz(){
        System.out.println("teste  asdasd");
    }
}
