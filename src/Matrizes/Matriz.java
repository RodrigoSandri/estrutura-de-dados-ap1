package Matrizes;

import java.util.Random;

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
        Random random = new Random();
        for (int a = 0; a < linha; a++){
            for (int l = 0; l < coluna; l++){
                this.matriz[a][l] = random.nextInt(100);
            }
        }
    }

    public void inserirElemento(int l, int c, int valor){
        if (l != 0)
            linha = l--;
        if (c != 0)
            coluna = c--;
        if (linha >= 0 && this.linha < linha && coluna >= 0 && this.coluna < coluna){
            this.matriz[linha][coluna] = valor;
        } else {
            System.out.println("Posição inválidade!!!");
        }
    }

    public void removerElemento(int linha, int coluna){
        if (linha >= 0 && this.linha < linha && coluna >= 0 && this.coluna < coluna){
            this.matriz[linha][coluna] = 0;
        } else {
            System.out.println("Posição inválidade!!!");
        }

    }

    public void exibirMatriz() {
        for (int i = 0; i < linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println("|");
        }
    }

    public int[][] getMatriz(){
        return matriz;
    }
}
