public class Main {
    public static void main(String[] args) {
        double first = 15.5;
        double second = 22.3;
        System.out.println("����� ����� 15.5 � 22.3 ����� "+ (first+second));
        System.out.println("�������� ��������� ����� 15.5 � 22.3 ����� "+ String.format("%5.2f",(first-second)));
        System.out.println("�������� ��������� ����� 15.5 � 22.3 ����� "+ String.format("%5.2f",(first*second)));
        System.out.println("�������� ������� ����� 15.5 � 22.3 �����"+ String.format("%5.2f",(first/second)));
    }
}