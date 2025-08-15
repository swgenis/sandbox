package sample.model.fruit;

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

}
