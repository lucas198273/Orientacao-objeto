package calculos.calculo2;

public class calculator {
  //  if(static in metodo ){
  //      Basta chamar a classe pelo nome
  //       e selecionar o metodo desejao
  //  }else Devera instaciar a o objeto no programa principal
    public static final double PI = 3.14;

    public static double circuference(double raidus){
        return 2.0 * PI* raidus;

    }
    public static double volume(double raidus){
        return 4.0* PI*raidus*raidus*raidus;
    }    
}
