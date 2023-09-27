public abstract class Car implements Printable {
    private int speed;
    private String color;

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;

    }

    public int getSpeed() {
        return speed;
    }



    public String getColor() {
        return color;
    }


}
