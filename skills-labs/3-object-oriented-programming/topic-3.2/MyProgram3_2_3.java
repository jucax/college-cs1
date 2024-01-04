class Car {
    public String getMake();  // get the car's make
    public String getModel(); // get the car's model
    public String getNoise(); // returns a String of the noise the car makes
}

class MyProgram3_2_3 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getNoise());
    }        
}