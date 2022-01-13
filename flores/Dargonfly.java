package flores;

interface HasWings {
    public int getNumberOfWings();
} abstract class Insect implements HasWings {
    abstract int getNumberOfLegs();
} public class Dargonfly extends Insect {
    int getNumberOfLegs() {
        return 6;
    }

    @Override
    public int getNumberOfWings() {
        return 0;
    }
}
