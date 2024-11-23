package strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("Hello");

        System.out.println(str1.equals(str2));

        str1 = str1.append(str2);

        System.out.println(str1);

        str2 = str2.reverse();

        System.out.println(str1);
        System.out.println(str2);
    }
}
