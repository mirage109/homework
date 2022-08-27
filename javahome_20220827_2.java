public class Main {
    public static void main(String[] args) {
        //превышение менее 10% от скоростного ограничения – не штрафуется

        //10% - менее 20%   от скоростного ограничения – 50 евро

        //20% - менее 30%   от скоростного ограничения – 150 евро не на автобане, и 200 на автобане

        //от 30% и выше  - 500евро плюс, если нарушение на автобане, лишение прав на 3 месяца.
        //Реализуйте программу, которая рассчитывает штраф и выводит соответствующее сообщение на экран.

        double speedAllowed = 100;
        double carSpeed = 150;
        boolean autoban = true;
        double tenPercent = 1.1;
        double twentyPercent = 1.2;
        double thirtyPercent = 1.3;
        if (carSpeed < (speedAllowed * tenPercent)) {
            System.out.println("Don't go so fast!");
        } else if ((carSpeed < speedAllowed * twentyPercent) && (carSpeed >= speedAllowed * tenPercent)) {
            System.out.println("Please, pay 50 Euro");
        } else if ((carSpeed < speedAllowed * thirtyPercent) && (carSpeed >= speedAllowed * twentyPercent) && !autoban) {
            System.out.println("Please, pay 150 Euro");
        } else if ((carSpeed < speedAllowed * thirtyPercent) && (carSpeed >= speedAllowed * twentyPercent) && autoban) {
            System.out.println("Please, pay 200 Euro");
        } else if (carSpeed >= speedAllowed * thirtyPercent && !autoban) {
            System.out.println("Please, pay 500 Euro");
        } else if (carSpeed >= speedAllowed * thirtyPercent && autoban) {
            System.out.println("Please, give your drive license and 500 euro.");
        }
    }

}
