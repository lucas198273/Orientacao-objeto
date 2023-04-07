package vetoresarrays.vetoreobjeto.entities;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas posiçoes deseja disponiblizar em seu arranjo? ");
        int n = sc.nextInt();

        // Vamos declara vetores
        double[] vect = new double[n]; // [n] representa o numero de posiçoes dentro do vetor
        for(int i= 0; i<n; i++ ){
            vect[i] = sc.nextDouble();

        }
        double sum = 0.0;
        for(int i =0; i<n; i++ ){
            sum += vect[i];
        }
        System.out.println(sum);

        double media = sum/n;
        System.out.println(media);
        sc.close();
    }
    
}
