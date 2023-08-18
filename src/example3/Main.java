package example3;

public class Main {
    public static void main(String[] args) {
        String s = "Необхідно створити рядок із текстом (текст взяти будь-який з інтернету). Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожну речення з нового рядка.";

        for (int i = 0; i < s.length() / 2; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        for (int i = s.length() / 2; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
