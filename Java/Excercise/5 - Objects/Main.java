package objects;

public class Main {
//    public static void main(String[] args) {
//        Person p = new Person();
//        Car c = new Car();
//        c.owner = p;
//        c.model = "Hunda Civic";
//        p.name = "Johnny Two Hats";
//
//
//        System.out.println("Person: " + c.owner.name +" Model: " + c.model);
//    }
//    public static void main(String[] args) {
//        int num = 55;
//        System.out.println(num);
//
//        modifyNum(num);
//
//        System.out.println(num);
//    }
//
//    public static void modifyNum(int num) {
//        num = num * 2;
//    }
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Fai One Glove";
        p.age = 53;

        System.out.println(p.name);
        System.out.println(p.age);

        modifyPerson(p);

        System.out.println(p.name);
        System.out.println(p.age);
    }

    public static void modifyPerson(Person p) {
        p.name = "Johnny Four Hats";
        p.age = 24;
    }
}
