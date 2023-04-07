package exercicio2.entidades;

public class Product {
    public String nome ;
    private double preco;
    private int quantidade;

   public Product(String nome, double preco,int quantidade){
    this.nome = nome;
    this.preco= preco;
    this.quantidade = quantidade;
   }

   public String getNome(){    // Get Nao nessecita de paramtros pois apenas retorna valor da variavel
    return nome;
   }
   public void setNome(String nome){  
    this.nome = nome;          // alterção nessecita de parametro "Nome" 
   }
   public double getPreco(){
    return preco;
   }
   public void setPreco(double preco){
    this.preco = preco;
   }
   public int getQuantidade(){
    return quantidade;
   }
   
   // Total Valor em Estoque
   public double TotalValorEstoque(){
    return preco * quantidade;
   }
   // Adiciona produto
   public void AddProduto(int quantidade ){
    this.quantidade += quantidade;
   }
   // Remove produto
   public void RemoveProduto(int quantidade){
    this.quantidade -= quantidade;
   }

   public String toString(){
    return nome +" "+String.format("%.2f", preco)+ " "+String.format("%.2f", quantidade);
   }
   

}
