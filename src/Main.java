import CarParts.Car;

public class Main {
    public static void main(String[] args) {
        Car Honda = new Car();
        while (!Honda.isStopped()) {
            Honda.carMoving();
        }
    }
}