package sample.model.fruit;

import java.util.Objects;

public class FruitResponse extends Fruit {

    private String color;

    public FruitResponse() {
    }

    public FruitResponse(Fruit fruit, String color) {
        super(fruit.getName(), fruit.getDescription());
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FruitResponse that = (FruitResponse) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "FruitResponse{" +
                "color='" + color + '\'' +
                '}';
    }

}
