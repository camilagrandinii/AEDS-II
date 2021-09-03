import java.util.*;

public class palindromo_3 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean isPalindrome(String str) {
        String reversePhrase;
        reversePhrase = new StringBuffer(str).reverse().toString();
        if (str.equals(reversePhrase)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFim(String str) {
        if (str.length() == 3 && str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        boolean answer;
        String phrase = "";
        while (isFim(phrase) != true) {
            phrase = sc.nextLine();
            answer = isPalindrome(phrase);
            if (answer == true) {
                System.out.println("SIM");
            } else if (answer == false) {
                System.out.println("NAO");
            }
        }
    }
}

