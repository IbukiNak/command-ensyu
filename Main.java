import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("身長を入力してください。(m)");
        Scanner sc = new Scanner(System.in);
        double height = Double.parseDouble(sc.nextLine());

        System.out.println("体重を入力してください。(Kg)");
        double weight = Double.parseDouble(sc.nextLine());

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println(bmi);
            System.out.println("低体重");
        } else if (bmi < 25) {
            System.out.println(bmi);
            System.out.println("普通体重");
        } else if (25 <= bmi) {
            System.out.println(bmi);
            System.out.println("肥満");
        }
    }
}