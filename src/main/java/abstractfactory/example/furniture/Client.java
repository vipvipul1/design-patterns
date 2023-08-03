package abstractfactory.example.furniture;

import abstractfactory.example.furniture.chairs.Chair;
import abstractfactory.example.furniture.factories.FurnitureAbstractFactory;
import abstractfactory.example.furniture.factories.ModernFactory;
import abstractfactory.example.furniture.factories.VictorianFactory;
import abstractfactory.example.furniture.sofas.Sofa;

public class Client {
    public static void main(String[] args) {
        // Only changing the userRequestVariant to "Modern"/"Victorian" will enable us to create
        // products(Sofa/Chair) of different variants(Modern/Victorian).
        String userRequestVariant = "Modern";
//        String userRequestVariant = "Victorian";
        FurnitureAbstractFactory furnitureFactory = getFurnitureFactory(userRequestVariant);

        Chair chair = furnitureFactory.createChair();
        chair.hasHeadRest(2);
        chair.getCushionType(2);

        Sofa sofa = furnitureFactory.createSofa();
        sofa.getMaxSitCount(2);
        sofa.isSleepExtendable(2);
    }

    public static FurnitureAbstractFactory getFurnitureFactory(String furnitureVariant) {
        FurnitureAbstractFactory furnitureFactory = null;
        if ("Modern".equals(furnitureVariant)) {
            furnitureFactory = new ModernFactory();
        } else if ("Victorian".equals(furnitureVariant)) {
            furnitureFactory = new VictorianFactory();
        }
        return furnitureFactory;
    }
}
