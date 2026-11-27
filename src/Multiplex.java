public class Multiplex extends Cinema {
    public Multiplex(String name) {
        super(name);
        System.out.println(name + " створений");
    }

    @Override
    public void endWorking() {
        System.out.println("Сподіваюсь в наступний раз ви придбаєте більше попкону");
    }
}