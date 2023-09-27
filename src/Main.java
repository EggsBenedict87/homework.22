public class Main {
    public static void main(String[] args) {
        Car[] car = new Car[3];
        for (int i = 0; i < car.length; i++) {
            System.out.println();
            car[0] = createObject("Mercedes");
            car[1] = createObject("BMW");
            car[2] = createObject("Toyota");
            car[i].print();

        }

    }
    public static Car createObject(String className) {
        Car car = null;
        switch (className){
            case "Mercedes":
                car = new Mercedes(10000, 2004, 60, "gray");
                break;
            case "BMW":
                car = new BMW(80, "red" , "good", 2);
                break;
            case "Toyota":
                car = new Toyota(100, "black", "Mike Tyson",4 );
                break;

        }
        return car;
    }
}
