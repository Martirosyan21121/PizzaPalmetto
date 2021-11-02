package models;


import enums.PizzaIngredients;
import enums.PizzaType;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class Order {

    private int orderNumber;
    private int customerNumber;
    private List<Pizza> pizzas;
    private List<PizzaIngredients> pizzaIngredients;
    private LocalTime localTime;
    private PizzaType pizzaType;
    private int quantity;

    public Order() {
    }

    public Order(int orderNumber, int customerNumber, List<Pizza> pizzas, List<PizzaIngredients> pizzaIngredients, LocalTime localTime, PizzaType pizzaType, int quantity) {
        this.orderNumber = orderNumber;
        this.customerNumber = customerNumber;
        this.pizzas = pizzas;
        this.pizzaIngredients = pizzaIngredients;
        this.localTime = localTime;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    public int getOrderNumber() {
        if (getOrderNumber() < 10000 && getOrderNumber() > 99999){
            System.out.println("wrong number");
        }
        return orderNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<PizzaIngredients> getPizzaIngredients() {
        return pizzaIngredients;
    }

    public void setPizzaIngredients(List<PizzaIngredients> pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber && customerNumber == order.customerNumber && quantity == order.quantity && Objects.equals(pizzas, order.pizzas) && Objects.equals(pizzaIngredients, order.pizzaIngredients) && Objects.equals(localTime, order.localTime) && pizzaType == order.pizzaType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, customerNumber, pizzas, pizzaIngredients, localTime, pizzaType, quantity);
    }


    public void displaying(Pizza pizza) {
        if (pizza.getName().toCharArray().length >= 4 && pizza.getName().toCharArray().length <= 20) {
            pizzas.add(pizza);
        } else {
            System.out.print(pizza.getPizzaNumber() + "_" + pizza.getName() + "_" + "_" + pizza.getQuantity());

        }
    }

    public String addIngredient(Pizza pizza2, PizzaIngredients pizzaIngredients) {
        displaying(pizza2);
        if (pizza2.getIngredients().size() == 7) {
            System.out.println("pizza is already \"full\"");
        }
        if (pizza2.getIngredients().contains(pizzaIngredients)) {
            System.out.println("you have already used that Ingredients please check again");
        } else
            pizza2.getIngredients().add(pizzaIngredients);

        return "Your pizza was added";

    }
public void printCheck(Order order, Pizza pizza){
    double amount = 0;

    System.out.println("Order: " + order.getOrderNumber());
    System.out.println("Client: " + order.getCustomerNumber());
    System.out.println("Name: " + pizza.getName());
//?
}
}