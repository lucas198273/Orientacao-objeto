package exercicio2.aplicacao;

import java.util.Scanner;

import exercicio2.entidades.Order;
import exercicio2.entidades.Product;

public class Program {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Entre com o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Entre com o preço: ");
        double preco = scanner.nextDouble();

        System.out.println("Entre com a quantidade: ");
        int quantidade = scanner.nextInt();

        Product product = new Product(nome, preco, quantidade);
        System.out.println(" Produto "+ product.getNome()+ "\n Preço R$"+product.getPreco()+ "\n Quantidade: "+ product.getQuantidade());

        System.out.println(" Deseja adicionar quantos produtos ao estoque: ");
        quantidade = scanner.nextInt();
        product.AddProduto(quantidade);
        System.out.println(" Produto "+ product.getNome()+ "\n Preço R$"+product.getPreco()+ "\n Quantidade: "+ product.getQuantidade());

        System.out.println("Deseja remover quantas unidades do estoque: ");
        quantidade = scanner.nextInt();
        product.RemoveProduto(quantidade);
        

        System.out.println(" Produto "+ product.getNome()+ "\n Preço R$"+product.getPreco()+ "\n Quantidade: "+ product.getQuantidade());

        System.out.println("Total valor estoque: "+product.TotalValorEstoque());

        Product p = new Product("Trator", 145.0, 50);

        System.out.println(p.getNome()+p.getPreco()+p.getQuantidade());
        scanner.close();
    }
}
