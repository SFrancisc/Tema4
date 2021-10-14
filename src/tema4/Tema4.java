package tema4;

import java.util.List;
import java.util.Scanner;

public class Tema4 {

    public static boolean ex1() {
        Scanner scanner = new Scanner(System.in);
        int[] p = new int[3];
        int negativeNumberCount = 0;
        System.out.println("Scrie 3 cifre: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Scrie cifra " + (i + 1) + ": ");
            p[i] = scanner.nextInt();
            if (p[i] < 0) {
                negativeNumberCount++;
            }
        }

        if (negativeNumberCount >= 2) {
            return false;
        }
        return true;
    }


    public static int ex2() {

        Scanner scanner = new Scanner(System.in);
        int[] p = new int[3];
        System.out.println("Scrie 3 cifre: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Scrie cifra " + (i + 1) + ": ");
            p[i] = scanner.nextInt();
        }

        int max1 = p[0] > p[1] ? p[0] : p[1];
        int max2 = p[1] > p[2] ? max1 : p[2];

        return max2;
    }


    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrie limitaStanga: ");
        int limitaStanga = scanner.nextInt();
        System.out.println("Scrie limitaDreapta: ");
        int limitaDreapta = scanner.nextInt();
        for (int i = limitaStanga; i <= limitaDreapta; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean ex4() {
        boolean prim = true;
        int numar = 5;
        for (int i = 2; i <= numar % 2; i++) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }


    public static void ex5() {
        String palindrom = "ana";
        String reverse = "";
        for (int i = palindrom.length() - 1; i >= 0; i--) {
            reverse += palindrom.charAt(i);

        }
        System.out.println(reverse);
        if (palindrom.equals(reverse)) {
            System.out.println("Este Palindrom ");

        }
    }


    public static void ex6(int n) {
        int fib = 1;
        int precedent = 1;
        int anteprecedent = 0;
        for (int i = 0; i <= n - 1; i++) {
            fib = precedent + anteprecedent;
            System.out.println(fib);
            anteprecedent = precedent;
            precedent = fib;
        }
    }


    public static void ex7() {
        int numarAles = 6;
        int sumaDivizori = 0;
        for (int i = 1; i < numarAles; i++) {
            if (numarAles % i == 0) {
                sumaDivizori += i;
            }
        }
        if (sumaDivizori == numarAles) {
            System.out.println("Este Numer Perfect");

        } else {
            System.out.println("Nu Este Numar Perfect");
        }
    }


    public static int ex8(int x) {
        if (x < -5) {
            return x + 10;
        } else if (x > -5 && x <= 10) {
            return x * 2;
        }
        return x * x + 50;
    }


    public static void ex9() {
        List<String> monedeList = List.of("EUR", "USD", "AUD", "CHF", "GBP");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu suma dorita: ");
        int suma = scanner.nextInt();

        System.out.println("Alege una din monedele urmatoatre: \"EUR\" , \"USD\" , \"AUD\" , \"CHF\" , \"GBP\"");
        String valuta = scanner.next();

        while (!monedeList.contains(valuta)) {
            System.out.println("Moneda aleasa nu este corespunzatoare. Alege una din monedele urmatoare: \"EUR\" , \"USD\" , \"AUD\" , \"CHF\" , \"GBP\"");
            valuta = scanner.next();
        }

        double eur = 4.95;
        double usd = 4.28;
        double aud = 3.15;
        double chf = 4.61;
        double gbp = 5.83;

        switch (valuta) {
            case "EUR" :
                System.out.println(suma / eur);
                break;
            case "USD" :
                System.out.println(suma / usd);
                break;
            case "AUD" :
                System.out.println(suma / aud);
                break;
            case "CHF" :
                System.out.println(suma / chf);
                break;
            case "GBP" :
                System.out.println(suma / gbp);
                break;

        }
    }


    public static boolean ex10 (String str) {
        String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String numbers = "0123456789";
        boolean hasSpecialCharacter = false;
        boolean hasNumber = false;
        boolean hasUpperCharacter = false;
        boolean hasLowerCharacter = false;
//        char[] chrStr1 = str.toCharArray();
//        List<String> chrStr = str.chars();

        if (str.length() < 8){
            return false;
        }

        for (int i = 0; i < str.length(); i++){
            if(specialCharacters.contains(Character.toString(str.charAt(i)))){
                hasSpecialCharacter = true;
            }else if(numbers.contains(Character.toString(str.charAt(i)))){
                hasNumber = true;
            }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                hasLowerCharacter = true;
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                hasUpperCharacter = true;
            }
        }

        if (hasNumber && hasLowerCharacter && hasUpperCharacter && hasSpecialCharacter){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        System.out.println(ex1());
        System.out.println(ex2());
        ex3();
        System.out.println(ex4());
        ex5();
        ex6(8);
        ex7();
        System.out.println(ex8(20));
        ex9();
        System.out.println(ex10("1!asdASD"));

    }
}

