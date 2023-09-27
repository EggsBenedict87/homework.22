public class BMW extends Car implements Printable{
    private String durable;
    private int length;

    public BMW(int price, int year, int speed, String color) {
        super(speed, color);
        this.durable = durable;
        this.length = length ;
    }

    public String getDurable() {
        return durable;
    }


    public int getLength() {
        return length;
    }



    @Override
    public void print() {
        System.out.println("durable: " + this.durable +
                "\nlength: " + this.length +
                "\nspeed: " + getSpeed() +
                "\ncolor: " + getColor());
    }
}
