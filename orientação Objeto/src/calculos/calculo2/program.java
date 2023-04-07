package calculos.calculo2;

import java.util.Scanner;

public class program {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter radius");
        double raidus = scan.nextDouble(); 

        double circuference = calculator.circuference(raidus);

        double  volume = calculator.volume(raidus);


        System.out.println(" Circuference: "+ circuference);
        System.out.println(" Volume: "+ volume);
        System.out.println(" PI"+calculator.PI);
    }


    
}
