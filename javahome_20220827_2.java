public class Main {
    public static void main(String[] args) {
        //���������� ����� 10% �� ����������� ����������� � �� ����������

        //10% - ����� 20%   �� ����������� ����������� � 50 ����

        //20% - ����� 30%   �� ����������� ����������� � 150 ���� �� �� ��������, � 200 �� ��������

        //�� 30% � ����  - 500���� ����, ���� ��������� �� ��������, ������� ���� �� 3 ������.
        //���������� ���������, ������� ������������ ����� � ������� ��������������� ��������� �� �����.

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

