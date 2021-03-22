package BaseSyntax;

public class leapYearCount {
    public static int count(int year){
        return ((year / 4 - year / 100) + year / 400);
    }

    public static void main(String[] args) {
        System.out.println(count(1));
        System.out.println(count(4));
        System.out.println(count(100));
    }
}
