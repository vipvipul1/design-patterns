package abstractfactory.example.furniture.factories;

import abstractfactory.example.furniture.chairs.Chair;
import abstractfactory.example.furniture.sofas.Sofa;

public interface FurnitureAbstractFactory {
    public Chair createChair();
    public Sofa createSofa();
}
