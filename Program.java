public class Program {
    public static void main(String[] args) {
        counting();
        summa();
    }

    static void counting() {
        //First level: C ������� ����� for �������� �����, ���������� ����� �� 1 ��  �����  n
        int n = 15;
        for (int i = 0; i <= n; i += 1) {
            System.out.println(i + " ");
        }
    }

    static void summa() {
        //C ������� ����� for �������� ����� ������������ ����� ���� �� 1 �� ����� n
        int num = 10;
        int y;
        int result = 0;
        for (y = 0; y <= num; y += 1) {
            result += y;
        }
        System.out.println("Sum of numbers from 1 to 10 is " + result);
    }
}