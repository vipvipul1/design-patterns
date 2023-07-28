package abstractfactory.example.furniture.sofas;

public class VictorianSofa implements Sofa {
    @Override
    public int getMaxSitCount(int sofaId) {
        int maxSitCount = 2;            // get from db
        System.out.println("Victorian Sofa: Sofa Id " + sofaId + " can accommodate max " + maxSitCount + " persons");
        return maxSitCount;
    }

    @Override
    public boolean isSleepExtendable(int sofaId) {
        boolean isSleepExtendable = false;    // get from db
        String val = isSleepExtendable ? " is" : " isn't";
        System.out.println("Victorian Sofa: Sofa Id " + sofaId + val + " sleep extendable");
        return isSleepExtendable;
    }
}
