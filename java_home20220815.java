public class Main {
    public static void main(String[] args)
    {
        //First level: ���������� ���������, ������� ������� ��������� �������, �������� ���. �.�. ���� ��������� ������ � ������ ��� (��������, 19%) ���� ��������� ������ ����������, �������, ������� �� ������ ��������, �������� �����.//
        double milk = 20.10 ;
        double bread = 10.50 ;
        double cake = 110.99 ;
        double vat20 = 1.2 ;
        double milkVat = milk*vat20;
        double breadVat = bread*vat20;
        double cakeVat = cake*vat20;
        double productsWithVat = (milk+bread+cake)*vat20;
        double vatUAH = productsWithVat - milk - bread - cake;
        System.out.println ("� �������� � ������ ������, ���� � ����.");
        System.out.println ("������ ������ "+ milkVat +"���. � ���� "+ breadVat +" ���. ���� ��� �������� � "+ String.format("%5.2f", cakeVat) +" ���.");
        System.out.println ("�� ��� ������ � ��������� "+ String.format("%5.2f", productsWithVat) +" ��� ������� ���.");
        System.out.println("� ��������� ��� "+ String.format("%5.2f", vatUAH) +"���.");
    }
}