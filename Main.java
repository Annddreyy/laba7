import java.util.Objects;
import java.util.Scanner;
class Product{
    String name;
    String producer;
    double price;
    double shelfLife;
    int amount;

    Product(String name, String producer, double price, double shelfLife, int amount){
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.amount = amount;
    }

    public void display(){
        System.out.println(producer);
        System.out.println(price);
        System.out.println(shelfLife);
        System.out.println(amount);
    }
}
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Product[] products = new Product[5];
        products[0] = new Product("Ноутбук1", "Lenovo", 100000, 5, 10);
        products[1] = new Product("Ноутбук2", "HP", 130000, 7, 20);
        products[2] = new Product("Ноутбук3", "DELL", 90000, 3, 5);
        products[3] = new Product("Ноутбук4", "Apple", 98000, 1, 1);
        products[4] = new Product("Ноутбук5", "Lenovo", 101000, 7, 32);

        System.out.print("Введите наименование товара: ");
        String name = scanner.nextLine();

        for (Product product : products) {
            if (Objects.equals(product.name, name))
                product.display();
        }
    }
}