package ss1_introduction_java.BaiTap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input amount DOLLAR need convert: ");
        double usd = scanner.nextDouble();
        double vnd = usd*24567;
        System.out.print("VND was converted: " + vnd + "VND");
    }
}
