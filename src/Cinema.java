public class Cinema {
    private final String name;

    public Cinema(String name) {
        this.name = name;
        System.out.println("Батько створений");
    }

    public void startWorking() {
        System.out.println(this.name + " почав показ фільмів");
    }

    public void showBenefits() {
        System.out.println("Низька ціна, великі зали");
    }

    public void endWorking() {

    }
}