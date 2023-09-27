public class Toyota extends Car implements Printable{
    private String owner;
    private int seats;

    public Toyota(int price, int year, int speed, String color) {
        super(speed, color);
        this.owner = owner;
        this.seats = seats;
    }

    public String getOwner() {
        return owner;
    }

    public int getSeats() {
        return seats;
    }


    @Override
    public void print() {
        System.out.println("owner: " + this.owner +
                "\nseats: " + this.seats +
                "\nspeed: " + getSpeed() +
                "\ncolor: " + getColor());

    }
}
