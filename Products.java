package superMarket;

public class Products {
    
    private int productId;
    private int quantity;
    private double price;
    private String productName;
    
    /*Products(int i, int q, double p, String n) {
        productId = i;
        quantity = q;
        price = p;
        productName = n;
    }*/
    
    int getProductId() {
        return this.productId;
    }
    
    int getQuantity() {
        return this.quantity;
    }
    
    double getPrice() {
        return this.price;
    }
    
    String getProductName() {
        return this.productName;
    }
    
    public void displayProducts() {
        
    }
    
    public void editProducts() {
        
    }
}
