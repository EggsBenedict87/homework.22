public class Mercedes extends Car implements Printable{
    private int price;
    private int year;

    public Mercedes(int price, int year, int speed, String color) {
        super(speed, color);
        this.price = price;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }



    public int getYear() {
        return year;
    }



    @Override
    public void print() {
        System.out.println("price: " + this.price +
                "\nyear: " + this.year +
                "\nspeed: " + getSpeed() +
                "\ncolor: " + getColor());
    }
}
