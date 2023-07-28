package decorator.example.icecream;

import decorator.example.icecream.cone.OrangeCone;
import decorator.example.icecream.scoop.ChocoScoop;
import decorator.example.icecream.scoop.VanillaScoop;
import decorator.example.icecream.cone.LichiCone;
import decorator.example.icecream.cone.StrawberryCone;
import decorator.example.icecream.syrup.ChocoSyrup;

public class Client {
    public static void main(String[] args) {
//        Invalid ice-cream as LichiCone can be base ice-creeam only.
//        Icecream icecream = new VanillaScoop(new ChocoScoop(new LichiCone(new ChocoSyrup(new StrawberryCone()))));
//        System.out.println(icecream.getCost());
//        System.out.println(icecream.getDescription());

        Icecream icecream1 = new VanillaScoop(new ChocoScoop(new OrangeCone(new ChocoSyrup(new StrawberryCone()))));
        System.out.println(icecream1.getCost());
        System.out.println(icecream1.getDescription());

        Icecream icecream2 = new ChocoScoop(new VanillaScoop(new ChocoSyrup(new OrangeCone(new LichiCone()))));
        System.out.println(icecream2.getCost());
        System.out.println(icecream2.getDescription());
    }
}
