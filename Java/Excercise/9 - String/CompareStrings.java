package strings;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Hello");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
