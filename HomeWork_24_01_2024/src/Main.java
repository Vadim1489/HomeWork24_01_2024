import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "Я пошёл пошёл, гриб нашёл";

        System.out.println("Пользователь введите первое предложение: ");
        str = scanner.nextLine();

        str = str.replace("пошёл пошёл" , "пицца");
        System.out.println(str);

        String str1 = "Видение судьбы, повиновение судьбы";

        System.out.println("Пользователь введите второе предлжение: ");
        str1 = scanner.nextLine();
        str1 = str1.substring(0,27);

        String newstr1 = str1;

        newstr1 = newstr1.replace("судьбы" , "пицца");
        System.out.println(newstr1);



    }
}
