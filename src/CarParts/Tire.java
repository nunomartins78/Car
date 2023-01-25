package CarParts;

public class Tire {
    public int integrity = 1000;
    public int decay;

    public Tire(int tireDecay) {
        decay = tireDecay;
    }

    public boolean checkIntegrity() {
        if (integrity <= 0) {
            return false;
        }
        return true;
    }
}
