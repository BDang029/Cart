package murach.business;

import java.io.Serializable;
import java.text.NumberFormat;

public class LineItem implements Serializable {

    private Product product;
    private int quantity;
    double giamgia;
    
    public LineItem() {}
    public void setProduct(Product p) {
        product = p;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
     public void setgiamgia(double giamgia) {
        this.giamgia = giamgia;
    }

    public double getgiamgia() {
        return giamgia;
    }

    public double getTotal() {
        double total = product.getPrice() * quantity * 0.5;
        return total;
    }

    public String getTotalCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }

}