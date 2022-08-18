public class Main {
    public static void main(String[] args) {
        //First level: Допустим, у вас есть прибор, у которого есть 3 колбы. Каждая колба имеет датчик температуры. Считается, что прибор работает правильно, если температура в каждой из трех колб не меньше 100 или есть такая колба, температура которой более 200 градусов. Напишите программу проверки корректности работы такого прибора.

        int flask1 = 160;
        int flask2 = 10;
        int flask3 = 60;
        boolean runCorrect = (flask1 > 100 & flask2 > 100 & flask3 > 100) | flask1 > 200 | flask2 > 200 | flask3 > 200;
        System.out.println("The device is working correct - " + runCorrect);
//Second level: Допустим, у вас есть прибор, у которого есть 3 колбы. Каждая колба имеет датчик температуры. Считается, что прибор работает правильно, если температура в одной из трех колб (не известно в какой) температура более 150 градусов, а в остальных менее100 градусов, и при этом сумма температур всех трех колб не превышает 250 градусо
        boolean runCorrectLevel2 = (flask1 > 150 & flask2 < 100 & flask3 < 100) | (flask1 < 100 & flask2 > 150 & flask3 < 100) | (flask1 < 100 & flask2 < 100 & flask3 > 150) & (flask1 + flask2 + flask3 < 250);
        System.out.println("The device is working correct in level 2 - " + runCorrectLevel2);
    }
}