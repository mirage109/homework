public class Main {
    public static void main(String[] args) {
        //ïðåâûøåíèå ìåíåå 10% îò ñêîðîñòíîãî îãðàíè÷åíèÿ – íå øòðàôóåòñÿ

        //10% - ìåíåå 20%   îò ñêîðîñòíîãî îãðàíè÷åíèÿ – 50 åâðî

        //20% - ìåíåå 30%   îò ñêîðîñòíîãî îãðàíè÷åíèÿ – 150 åâðî íå íà àâòîáàíå, è 200 íà àâòîáàíå

        /îò 30% è âûøå  - 500åâðî ïëþñ, åñëè íàðóøåíèå íà àâòîáàíå, ëèøåíèå ïðàâ íà 3 ìåñÿöà.
        //Ðåàëèçóéòå ïðîãðàììó, êîòîðàÿ ðàññ÷èòûâàåò øòðàô è âûâîäèò ñîîòâåòñòâóþùåå ñîîáùåíèå íà ýêðàí.

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

