package models;

import enums.PizzaIngredients;
import enums.PizzaType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pizza {

    private int pizzaNumber;
    private String name;
    private List<PizzaIngredients> ingredients = new ArrayList<>();
    private PizzaType pizzaType;
    private int quantity;
    private int price;


    public Pizza() {
    }

    public Pizza(int pizzaNumber, String name, List<PizzaIngredients> ingredients, PizzaType pizzaType, int quantity, int price) {
        this.pizzaNumber = pizzaNumber;
        this.name = name;
        this.ingredients = ingredients;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        this.price = price;
    }

    public int getPizzaNumber() {
        if (getPizzaNumber() < 10000 && getPizzaNumber() > 99999){
            System.out.println("wrong number");
        }
        return pizzaNumber;
    }

    public void setPizzaNumber(int pizzaNumber) {
        this.pizzaNumber = pizzaNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PizzaIngredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<PizzaIngredients> ingredients) {
        this.ingredients = ingredients;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return pizzaNumber == pizza.pizzaNumber && quantity == pizza.quantity && price == pizza.price && Objects.equals(name, pizza.name) && Objects.equals(ingredients, pizza.ingredients) && pizzaType == pizza.pizzaType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzaNumber, name, ingredients, pizzaType, quantity, price);
    }
}
