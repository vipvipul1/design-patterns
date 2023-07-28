package abstractfactory.example.furniture.sofas;

public class ModernSofa implements Sofa {
    @Override
    public int getMaxSitCount(int sofaId) {
        int maxSitCount = 3;            // from db
        System.out.println("Modern Sofa: Sofa Id " + sofaId + " can accommodate max " + maxSitCount + " persons");
        return maxSitCount;
    }

    @Override
    public boolean isSleepExtendable(int sofaId) {
        boolean isSleepExtendable = true;    // get from db
        String val = isSleepExtendable ? " is" : " isn't";
        System.out.println("Modern Sofa: Sofa Id " + sofaId + val + " sleep extendable");
        return isSleepExtendable;
    }
}
