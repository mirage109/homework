public class Main {
    public static void main(String[] args) {
        //�����������, ��� �� ������ ��������� ��� ������ ����������. � ��� �������� ���������� �����������  ������ � ������� ������� (����������� ������ � ���� ����������). ���� ��������� ������  �������� �� �����: ��� ������ �������� ���� ����� ��� ������� ������� ��� �� ��������

        int clientAge = 17;
        int filmAllowed = 18;

        if (clientAge >= filmAllowed) {
            System.out.println("Welcome to the Cinema");
        } else {
            System.out.println("Sorry, you are too young");
        }
    }
}
