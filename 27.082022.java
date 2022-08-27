public class Main {
    public static void main(String[] args) {
        //Представьте, что вы пишите программу для онлайн кинотеатра. У вас известно возрастное ограничение  фильма и возраст клиента (естественно заданы в виде переменных). Ваша программа должна  выдавать на экран: «вы можете смотреть этот фильм» или «данный контент вам не доступен»

        int clientAge = 17;
        int filmAllowed = 18;

        if (clientAge >= filmAllowed) {
            System.out.println("Welcome to the Cinema");
        } else {
            System.out.println("Sorry, you are too young");
        }
    }
}
