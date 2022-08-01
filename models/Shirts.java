package models;

import java.util.Objects;

public class Shirts extends Product {
    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    private Size size;


    public Shirts(Size size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;
    }

    public Shirts(Shirts source) {
        super(source);
        this.size = source.size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        System.out.println("Lay shirt on a flat surface");
        System.out.println("Fold shirt sideways");
        System.out.println("Bring sleeves in");
        System.out.println("Fold from the bottom up");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Shirts)) {
            return false;
        }
        Shirts shirts = (Shirts) o;
        return size.equals(shirts.size)
            && super.getPrice() == shirts.getPrice()
            && super.getColor().equals(shirts.getColor())
            && super.getBrand().equals(shirts.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getColor(), super.getBrand());
    }


    @Override
    public String toString() {
        return "SHIRT" +
            "\t" + getSize() + "" +
            "\t" + super.getPrice() + "" +
            "\t" + super.getColor() + "" +
            "\t" + super.getBrand() + "" +
            "";
    }

}