package calculos.calculo1;
import java.util.Locale;
import java.util.Scanner;


public class CalculandoArea {
    
    public static void main(String[] args){
        Triangulo  x,y; 
        x = new Triangulo();
        y = new Triangulo();

        Scanner scan = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Informe a medida das tres areas do triangulo X : ");
        
         x.x =scan.nextDouble();

         x.y =scan.nextDouble();

         x.z =scan.nextDouble();

         System.out.println("Informe a medida das tres areas do triangulo Y : ");
        
         y.x = scan.nextDouble();

         y.x = scan.nextDouble();

         y.x = scan.nextDouble();

         
         Double area = x.area(); // A chamada do metodo area(); é onde é feita a operação matematica
         Double area2 = y.area(); // // A chamada do metodo area(); é onde é feita a operação matematica
         
         // Raiz quadrada = sqrt

         

         System.out.println(" Area triangulo com medidas " + "Resultado: "+area);
         System.out.println(" Area triangulo com medidas " + "Resultado: "+area2);

         

        scan.close();
    }
}
