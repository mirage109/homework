public class Main {
    public static void main(String[] args) {
        double first = 15.5;
        double second = 22.3;
        System.out.println("Сумма чисел 15.5 и 22.3 будет "+ (first+second));
        System.out.println("Реультат вычитания чисел 15.5 и 22.3 будет "+ String.format("%5.2f",(first-second)));
        System.out.println("Реультат умножения чисел 15.5 и 22.3 будет "+ String.format("%5.2f",(first*second)));
        System.out.println("Реультат деления чисел 15.5 и 22.3 будет"+ String.format("%5.2f",(first/second)));
    }
}