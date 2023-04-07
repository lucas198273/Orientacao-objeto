package treinando.exerciciovetor;
 

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor {
    public static void main(String[] args){

        

        Scanner sc = new Scanner(System.in);

        int indice;

        System.out.println(" Quantos Numeros Voçê vai Digitar? ");
        indice = sc.nextInt();

        int[] vect = new int[indice];

        for(int i=0; i<indice; i++){
            System.out.println("Digite o "+i+" valor: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros Negativos :");

        for(int i=0; i <= indice; i++){
            if(vect[i] < 0){
                System.out.println("Negativo: "+vect[i]);
            }
            
        }

        

        sc.close();
    }
    
}
