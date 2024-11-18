package conditional;

public class main7 {
    public static void main(String[] args) {
        int[] grades = {66, 54, 89, 97, 38, 61};
        int highest = grades[0];
        int lowest = grades[0];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}
