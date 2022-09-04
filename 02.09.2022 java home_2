public class Main {
    public static void main(String[] args) {
        //Дано целое число num. Необходимо написать программу, которая считает, сколько разрядов в этом числе. Например:
        //           	3 -> 1
        //           	343 -> 3
        //           	98761 -> 5
        int power = 1;
        int base = 10;
        int input = -98761;
        int count = 0;
        int x = input;
        if (x < 0) {
            x = -x;
        }
        while (power <= x) {
            power *= base;
            count += 1;
        }
        System.out.println("Количество розрядов в числе " + input + " равно - " + count);
    }
}
