public class Main {
    public static void main(String[] args) {
        int d = 10;
        double r = d / 2.0;
        int n = 6;
        int newD = d + n;
        double newR = newD / 2.0;
        double firstPizzaSize = Math.PI * r * r;
        double secondPizzaSize = Math.PI * newR * newR;
        System.out.println(r);
        System.out.println("Площадь первой пиццы " + String.format("%5.2f", firstPizzaSize));
        System.out.println("Площадь новой пиццы " + String.format("%5.2f", secondPizzaSize));
        System.out.println("Разница будет " + String.format("%5.2f", (secondPizzaSize - firstPizzaSize)));

    }
}