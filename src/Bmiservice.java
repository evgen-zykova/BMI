public class Bmiservice {
    public double calculate(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;
    }
}
