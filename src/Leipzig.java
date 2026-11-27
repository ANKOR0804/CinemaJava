public class Leipzig extends Cinema {
    public Leipzig(String name) {
        super(name);
        System.out.println(name + " створений");
    }

    @Override
    public void endWorking() {
        System.out.println("Бай бай");
    }
}