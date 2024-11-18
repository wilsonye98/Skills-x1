package conditional;

public class main4 {
    public static void main(String[] args) {
        int n = 33;
        int counter = 0;
        while(n != 0) {
            if (counter % 2 == 0) {
                System.out.println(counter);
                n--;
            }
            counter++;
        }
    }
}
