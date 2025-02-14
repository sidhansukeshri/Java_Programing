class FoodOrder {
    private String itemName;
    private int quantity;

    // Constructor 1: Default order
    public FoodOrder() {
        this.itemName = "Burger";
        this.quantity = 1;
    }

    // Constructor 2: Order with item name only
    public FoodOrder(String itemName) {
        this.itemName = itemName;
        this.quantity = 1;
    }

    // Constructor 3: Order with item name and quantity
    public FoodOrder(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public void showOrder() {
        System.out.println("Order: " + itemName + " | Quantity: " + quantity);
    }

    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder();
        FoodOrder order2 = new FoodOrder("Pizza");
        FoodOrder order3 = new FoodOrder("Pasta", 3);

        order1.showOrder();
        order2.showOrder();
        order3.showOrder();
    }
}
