public class Main {

    public static void main(String []args){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(20, "35");
        Product product2 = new Product(25, "15");

        shoppingCart.addProduct(product);
        shoppingCart.addProduct(product2);

        //payPal payment at runtime
        shoppingCart.pay(new PayPalAlgorithm("monir@monirhossain.com","pass"));
        shoppingCart.pay(new CreditCardAlgorithm("monnest@monirhossain.com","password"));


    }
}
