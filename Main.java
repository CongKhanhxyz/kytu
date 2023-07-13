package org.example;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chuỗi");
            String input = scanner.next();
            int count = dem(input);
            System.out.println(count);
        }

        public static int dem(String input) {
            String[] kyTus = {"ă", "â", "đ", "ê", "ô", "ơ", "ư"};
            int count = 0;

            for (String kyTu : kyTus) {
                count += input.length() - input.replace(kyTu, "").length();
            }

            return count;
        }

}