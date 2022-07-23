import java.util.Scanner;

public class TextFromUser {

    public static void main(String[] args) {

      System.out.println("What's your name?");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        System.out.println("What's your surname?");
        String usersurname = sc.nextLine();

        System.out.println("How old are you?");
        int userage = sc.nextInt();

        int future = userage + 5;

        System.out.println("Hello " + username + " " + usersurname + ". In five years you will be " + future + " years old.");
    }


}
