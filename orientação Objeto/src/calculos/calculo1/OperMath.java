package calculos.calculo1;
import java.util.Scanner;

public class OperMath {
    public static void main(String[] args) throws Exception {
        double x = 25.0;
        double y = 10.0;
        double z = 14.0;

        double A,B,C;
        
        //A = Math.sqrt(x)  a recebe raiz quadrada de x
        //A = Math.pow(x,y) a recebe resultado de x elevado a y
        //A = Math.abs(x) a recebe valor absoluto de x 
        
        A = Math.sqrt(x);
        B = Math.pow(x, y);
        C = Math.abs(z);


        System.out.println(A);
        System.out.println(B);
        System.out.println(C);



               // manipulação com string
        // formatar = toLowerCase(), toUpperCase(),trim();
        // recortar = subString(Inicio), substring(inicio,fim)
        // buscar = indexOf, lstindexOf
        // str.split


        String original = "Jhonatan e Fabio sao Grandes Amigos";
                            // converte letras em minusculo
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
                            // converte para maiusculo
        System.out.println(original);

        
                        // eleimina espaços no inicio e fim da String
        System.out.println(s01);
        System.out.println(s02);

        String s03 = original.trim();
        System.out.println(" trim :"+ s03);

        String s04 = original.substring(15);
                                              // mostra apenas do 15 caractere
        System.out.println(s04);
        String s05 = original.substring(15, 30); // limita a impressao apenas do 15 elemento ate o 30 elemento
        System.out.println(s05);


        String s06 = original.replace("Fabio", "Frasncisco");
        String s07 = original.replace("Fabio", "Dias");
        
        
        System.out.println("s06s "+s06);
        System.out.println("s07 "+s07);

        int s08 = original.lastIndexOf("Fabio");
        int s09 = original.indexOf("and");

        System.out.println(s08);
        System.out.println(s09);


        // Para trabalhar com vetor utilizamos Split() 
        String Frase = "Nosso futuro é consequencia de nossas escolhas do passado";

        String [] vetor = Frase.split(" ");
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(  vetor[2]);
        System.out.println(vetor[3]);
        System.out.println(vetor[4]);
        System.out.println(  vetor[5]);


        Scanner scan = new Scanner(System.in);

        int pv ;
        int sv;
        int tv; 

        System.out.println("Entre com tres valores");
        pv= scan.nextInt();
        sv= scan.nextInt();
        tv= scan.nextInt();


            

        double a = Math.pow(pv, sv);
        double b = Math.abs(sv);
        double c = Math.sqrt(tv);


        if(pv > sv && pv > tv){
            System.out.println("maior: "+pv);
        }
        else 
            if(sv > pv && sv > tv){
                System.out.println("maior: "+ sv);
            }
            else System.out.println("Maior valor"+tv);
            
        System.out.println("Elevando primeiro valor "+pv +" por segundo valor "+sv +" Resultado -> "+a);
        System.out.println("Segundo valor digitado "+b);
        System.out.println("Raiz quadrada do terceiro valor "+" Resultado -> "+c);


        

            
        


         


    }
    }
 