import Matrizes.Matriz;

public class Main {
    public static void main(String[] args)
    {
        Matriz matriz1 = new Matriz(7, 9);
        Matriz matriz2 = new Matriz(7, 8);
        System.out.println("Primeira matriz original");
        matriz1.exibirMatriz();

        System.out.println("Inserindo valor na posição");
        matriz1.inserirElemento(0, 4, 7);

        System.out.println("Valor inserido");
        matriz1.exibirMatriz();


//        System.out.println("Segunda matriz original");
//        matriz2.exibirMatriz();
    }
}