package BaseSyntax;

public class palindrome {
    public static boolean isPalindrome(String text) {
        String cleared = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(cleared).reverse().toString();
        return reversed.equals(cleared);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
}
