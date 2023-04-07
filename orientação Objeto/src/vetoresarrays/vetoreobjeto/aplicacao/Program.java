package vetoresarrays.vetoreobjeto.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import exercicio2.entidades.Product;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int indiceVector = sc.nextInt();
        sc.nextLine(); // Corrigir leitura de quebra de linha

        Product[] vecto = new Product[indiceVector];

        for(int i = 0; i < indiceVector; i++){
            sc.nextInt();
            sc.nextLine(); // Corrigir leitura de quebra de linha
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vecto[i] = new Product(name, price);
        }
        
        double sum = 0.0;
        for(int  i=0; i<indiceVector; i++){
            sum += vecto[i].getPreco(); // Corrigir operador de soma
        }

        sc.close(); // Fechar o Scanner
    }
}

