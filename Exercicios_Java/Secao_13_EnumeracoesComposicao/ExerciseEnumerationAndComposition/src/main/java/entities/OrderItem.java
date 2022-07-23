package entities;

public class OrderItem {

    private int quantity;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double subTotal(){
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return product.getName() + ", $" + String.format("%.2f", product.getPrice()) +
                ", Quantity: " + quantity +
                ", Subtotal: $" + String.format("%.2f", subTotal());
    }
}