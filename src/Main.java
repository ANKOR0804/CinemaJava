public class Main {
    public static void main(String[] args) {
        Deluxe deluxe = new Deluxe("Делюкс");
        Kinoman kinoman = new Kinoman("Кіноман", 5);
        Leipzig leipzig = new Leipzig("Лейпціг");
        Multiplex multiplex = new Multiplex("Мультіплекс");

        deluxe.startWorking();
        deluxe.showBenefits();
        deluxe.endWorking();

        System.out.println();

        kinoman.startWorking();
        kinoman.showBenefits();
        kinoman.endWorking();

        System.out.println();

        leipzig.startWorking();
        leipzig.showBenefits();
        leipzig.endWorking();

        System.out.println();

        multiplex.startWorking();
        multiplex.showBenefits();
        multiplex.endWorking();
    }
}