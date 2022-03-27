package powerpackage;

public class PowerFinder {
    public static int of(int base, int expo) {
        int p = 1;
        for (int i = 0; i<expo; i++) {
            p *= base;
        }
        return p;
    }
}
