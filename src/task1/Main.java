package task1;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.Exception(1000,"28/10/00","Veselii molochnik");
        System.out.println(" " + product.priceOfProduct + " " + product.dateOfProduct + " "+ product.nameOfProduct);
    }

}
