package lab2.Task1.SuperAndSubclasses;

import java.util.Objects;

public class BookCase extends Furniture{
    private String type;
    private double height;
    private double width;


    public BookCase(String material, double weight, double height, double width, String type) {
        super(material, weight);
        this.height = height;
        this.width = width;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || !(o instanceof BookCase)) return false;

        BookCase temp = (BookCase) o;
        return this.type.equals(temp.type);
    }

    @Override
    public String toString() {
        return super.toString() + " Book case type: " + type + " width " + width + "and height"+ height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
