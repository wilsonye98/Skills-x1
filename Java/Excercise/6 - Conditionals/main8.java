package conditional;

public class main8 {
    public static void main(String[] args) {
        int[] narr = {23, 41, 56, 98, 43, 57, 88, 5};
        int sum = 0;
        int count = 0;
        for (int num : narr) {
            if (num % 2 != 0) {
                sum += num;
                count++;
            }
        }
        float average = (float) sum / count;
        System.out.println("Average: " + average);
    }
}
