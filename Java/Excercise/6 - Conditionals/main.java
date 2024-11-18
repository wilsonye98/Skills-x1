package conditional;

public class main {
    public static void main(String[] args){
        int age = 12;

        if (age <= 5) {
            System.out.println("FREE");
        }
        else if (age > 5 && age <= 12) {
            System.out.println("5");
        }
        else if (age > 12 && age <= 18) {
            System.out.println("10");
        }
        else {
            System.out.println("15");
        }
    }
}
