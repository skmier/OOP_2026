package lab2.Task1.SuperAndSubclasses;

import java.util.Objects;

public abstract class Furniture {
    private String material;
    private double weight;

    public Furniture(String material, double weight) {
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Furniture`s material: " + this.material + " weight: " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if((o == null) || !(o instanceof Furniture)) return false;

        Furniture temp = (Furniture) o;

        return this.getMaterial().equals(temp.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(material,weight);
    }



    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public String getMaterial() {
        return material;
    }
}
