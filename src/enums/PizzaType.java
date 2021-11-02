package enums;

public enum PizzaType {
    BASE(1),
    CALZONE(1.5);

    public  double price;

    PizzaType(double price) {
        this.price = price;
    }
}
