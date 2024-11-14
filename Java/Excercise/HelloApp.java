// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Hello " + name);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}