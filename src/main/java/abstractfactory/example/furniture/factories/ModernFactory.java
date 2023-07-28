package abstractfactory.example.furniture.factories;

import abstractfactory.example.furniture.chairs.Chair;
import abstractfactory.example.furniture.chairs.ModernChair;
import abstractfactory.example.furniture.sofas.ModernSofa;
import abstractfactory.example.furniture.sofas.Sofa;

public class ModernFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
