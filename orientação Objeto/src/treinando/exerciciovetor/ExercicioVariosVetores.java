package treinando.exerciciovetor;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioVariosVetores {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        // Limpar o buffer do Scanner
        sc.nextLine();

        for(int i = 0; i < n; i++){

            System.out.println("Digite os dados da pessoa " + (i + 1) + ":");

            System.out.println("Nome: ");
            nome[i] = sc.nextLine();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Altura : ");
            altura[i] = sc.nextDouble();

            // Limpar o buffer do Scanner
            sc.nextLine();
            double soma= 0.0;
            for(int j=0; j<n; j++){
                soma= soma+= altura[i];
            }
            System.out.println("Soma alturas: "+soma);
            
            double mediaAltura = soma/n;
            System.out.println("Media Altura: "+mediaAltura);
        }

        sc.close();
    }
}