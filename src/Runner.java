public class Runner {

    public static void main(String[] args){
        Car oihoihioioio = new Car(1991, "Sauce", "10");
        System.out.println(oihoihioioio.toString());
        oihoihioioio.drive(100);
        System.out.println(oihoihioioio.toString());

        Rectangle test = new Rectangle(10, 11);
            System.out.println(test.getDiagonal());
            System.out.println(test.getArea());
            System.out.println(test.isSquare());
    }
}
