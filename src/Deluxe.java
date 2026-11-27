public class Deluxe extends Cinema {
    private boolean isWorking = false;

    public Deluxe(String name) {
        super(name);
        System.out.println(name + " створений");
    }

    @Override
    public void showBenefits() {
        System.out.println("5Д, всі зали люксові");
    }

    @Override
    public void startWorking() {
        super.startWorking();
        isWorking = true;
    }

    @Override
    public void endWorking() {
        if (isWorking) {
            System.out.println("Дякую за відвідування, заклад закривається");
        }

        isWorking = false;
    }
}