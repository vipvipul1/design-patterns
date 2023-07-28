package abstractfactory.example.furniture.chairs;

public class ModernChair implements Chair {
    @Override
    public boolean hasHeadRest(int chairId) {
        System.out.println("Modern Chair: Chair Id " + chairId + " has head rest");
        return true;
    }

    @Override
    public String getCushionType(int chairId) {
        System.out.println("Modern Chair: Chair Id " + chairId + " has hard cushions");
        return "Hard";
    }
}
