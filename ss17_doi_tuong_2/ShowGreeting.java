package ss1_introduction_java.BaiTap;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name: ");
        String name = scanner.nextLine();
        System.out.println("Say hello: " + name);
    }
}
