package exercicio2.entidades;

import java.sql.Date;

public class Order {

    
    private Date date;
    private Product product;
    
    public Order(Date date, Product product ){
        super();
        this.date = date;
        this.product = product;
    }
    public Date getDate (){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public Product getProduct(){
        return product;
    }
    public void setProdruct(Product product){
        this.product = product;
    }
}
