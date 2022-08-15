public class Main {
    public static void main(String[] args)
    {
        //First level: Реализуйте программу, которая считает стоимость покупки, учитывая НДС. Т.е. дана стоимость товара и размер НДС (например, 19%) Ваша программа должна рассчитать, сколько, сколько вы должны оплатить, учитывая налог.//
        double milk = 20.10 ;
        double bread = 10.50 ;
        double cake = 110.99 ;
        double vat20 = 1.2 ;
        double milkVat = milk*vat20;
        double breadVat = bread*vat20;
        double cakeVat = cake*vat20;
        double productsWithVat = (milk+bread+cake)*vat20;
        double vatUAH = productsWithVat - milk - bread - cake;
        System.out.println ("В магазине я купила молоко, хлеб и торт.");
        System.out.println ("Молоко стоило "+ milkVat +"грн. А хлеб "+ breadVat +" грн. Торт мне обошелся в "+ String.format("%5.2f", cakeVat) +" грн.");
        System.out.println ("За все вместе я заплатила "+ String.format("%5.2f", productsWithVat) +" грн включая НДС.");
        System.out.println("Я заплатила НДС "+ String.format("%5.2f", vatUAH) +"грн.");
    }
}