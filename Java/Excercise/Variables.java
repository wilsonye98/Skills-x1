package structure;

public class Variables {
    public static void main(String[] args) {
        // E1
        int a = 3;
        int b = 6;
        System.out.println(a);
        System.out.println(b);
        // E2
        float x = 3.4f;
        float y = 72.4f;
        float sum = x + y;
        System.out.println(sum);
        // E3
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2;
        System.out.println(result);
        // E4
        int[] intArr = {1,2,3,4,5};
        System.out.println(intArr[0]);
        System.out.println(intArr[1]);
        System.out.println(intArr[2]);
        System.out.println(intArr[3]);
        System.out.println(intArr[4]);
        // E5
        int nr1 = 6;
        int nr2 = 8;
        int mulResult = nr1 * nr2;
        System.out.print(mulResult);
        // E6
        String txt = "Java Programming";
        int txtLen = txt.length();
        System.out.println(txtLen);
        // E7
        String[] fruits = {"Mango", "Pineapple", "Bananas", "Strawberries"};
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        // E8
        double db1 = 3.1415;
        double db2 = 6.2830;
        double dbResult = db1 / db2;
        System.out.println(dbResult);
        // E9
        double db3 = 123.456;
        int mInt = (int) db3;
        System.out.println(mInt);
    }
}
