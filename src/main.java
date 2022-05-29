public class main {
    public static void main(String[] args) {
        Bmiservice service = new Bmiservice();
        double mass = 70;
        double growth = 1.65;
        double bmi = service.calculate(mass, growth);
        System.out.println(bmi);
    }
}
