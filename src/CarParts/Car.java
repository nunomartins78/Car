package CarParts;

public class Car {

    Tire[] setOfTires;
    Radio radio;

    public Car() {
        radio = new Radio();

        setOfTires = new Tire[]{new Tire(70), new Tire(70), new Tire(70), new Tire(70)};

    }

    public void carMoving() {
        this.wearAndTear();
        this.tireIsBurst();
    }

    private void wearAndTear() {
        for (int i = 0; i < this.setOfTires.length; i++) {
            this.setOfTires[i].integrity = this.setOfTires[i].integrity - this.setOfTires[i].decay;
            System.out.println(this.setOfTires[i].integrity);
        }
    }

    public Boolean tireIsBurst() {
        for (int i = 0; i < this.setOfTires.length; i++) {
            if (this.setOfTires[i].checkIntegrity() == false) {
                return true;
            }
        }
        return false;
    }

    public Boolean isStopped() {
        if (this.tireIsBurst() == false) {
            return false;
        }
        System.out.println("Tire exploded");
        this.radio.musicIsPlaying();
        return true;
    }
}