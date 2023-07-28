package abstractfactory.example.furniture.chairs;

public class VictorianChair implements Chair {
    @Override
    public boolean hasHeadRest(int chairId) {
        System.out.println("Victorian Chair: Chair Id " + chairId + " doesn't have head rest");
        return false;
    }

    @Override
    public String getCushionType(int chairId) {
        System.out.println("Victorian Chair: Chair Id " + chairId + " has soft cushions");
        return "Soft";
    }
}
