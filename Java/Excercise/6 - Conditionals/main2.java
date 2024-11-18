package conditional;

public class main2 {
    public static void main(String[] args) {
        String grade = "C";
        String comment;

        switch(grade){
            case ("A"):
                comment = "Great job!";
                break;
            case "B":
                comment = "Just a little more!";
                break;
            case "C":
                comment = "Getting there!";
                break;
            case "D":
                comment = "Just a little more practice";
                break;
            case "F":
                comment = "Oops";
                break;
            default:
                comment = "Not a valid letter grade";
            }
        System.out.println(comment);
        }
    }

