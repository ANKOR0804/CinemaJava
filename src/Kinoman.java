public class Kinoman extends Cinema {
    private final int sessionsCount;

    public Kinoman(String name, int sessionsCount) {
        super(name);
        this.sessionsCount = sessionsCount;
        System.out.println(name + " створений");
    }

    @Override
    public void endWorking() {
        System.out.println("Сьогодні було показано " + sessionsCount + " сеансів, всім дякую.");
    }
}