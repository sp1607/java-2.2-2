public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float heightm = 1.56f;
        float weightkg = 48.5f;
        float bmi = service.calculate(heightm, weightkg);
        System.out.printf("%.1f", bmi);

    }
}