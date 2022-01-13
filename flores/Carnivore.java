package flores;
public interface Carnivore {
    int pieces = 10;
    public static void eatGrass() {
        System.out.println("Carnivores eat grass");
    }
    public default int chew() {
        return 13;
    }
}
