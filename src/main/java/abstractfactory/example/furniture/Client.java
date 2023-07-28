package abstractfactory.example.furniture;

import abstractfactory.example.furniture.chairs.Chair;
import abstractfactory.example.furniture.factories.FurnitureAbstractFactory;
import abstractfactory.example.furniture.factories.ModernFactory;
import abstractfactory.example.furniture.factories.VictorianFactory;
import abstractfactory.example.furniture.sofas.Sofa;

public class Client {
    public static void main(String[] args) {
        // Changing the factory object (VictorianFactory()/ModernFactory()) only will enable us to create
        // products(Sofa/Chair) of different variants(Modern/Victorian).
        FurnitureAbstractFactory furnitureFactory = new VictorianFactory();
//        FurnitureAbstractFactory furnitureFactory = new ModernFactory();

        Chair chair = furnitureFactory.createChair();
        chair.hasHeadRest(2);
        chair.getCushionType(2);

        Sofa sofa = furnitureFactory.createSofa();
        sofa.getMaxSitCount(2);
        sofa.isSleepExtendable(2);
    }
}
