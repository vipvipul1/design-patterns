package abstractfactory.example.furniture.factories;

import abstractfactory.example.furniture.chairs.Chair;
import abstractfactory.example.furniture.chairs.VictorianChair;
import abstractfactory.example.furniture.sofas.Sofa;
import abstractfactory.example.furniture.sofas.VictorianSofa;

public class VictorianFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
