package calculos.calculo1;
public class Triangulo{
    
        public double x;
        public double y;
        public double z;

        public double area(){
                double p = (x+y+z)/2;
                return Math.sqrt((p*((p-x)+(p-y)+(p-z))));
                
        }

       // double p = (x.x+x.y+x.z)/2;
      //  Double area = Math.sqrt((p*((p-x.x)+(p-x.y)+(p-x.z))));
    
}
