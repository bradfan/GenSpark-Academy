
public class Project5Worksheet {

//    OVERLOADING
//    Method overloading allows you to implement two or more methods with the same name, but different arguments.
//    The arguments of such methods may differ in their number or type. This helps to avoid having various method references for similar tasks.
//    When invoked, the proper method is chosen based on the provided arguments.
//    If the argument has a different type from what is expected, the closest type of the argument in order of the implicit casting is used.

//    CASTING
//    Be Careful! Bears shouldn't Ingest Large Furry Dogs
//    Boolean -> Char -> Byte -> Short -> Int -> Long -> Float -> Double

//    ACCESS MODIFIERS
//    private == access within the same class
//    protected == access in any class within the package and sub-classes(extends)
//    public == public

    public static void print(String stringToPrint) {
        System.out.println(stringToPrint);
    }

    public static void print(String stringToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(stringToPrint);
        }
    }

    public static void print(int times, String stringToPrint) {
        for (int i = 0; i < times; i++) {
            System.out.println(stringToPrint);
        }
    }

    public static void print(int val) {
        System.out.println(val);
    }



    public static void main(String[] args) {
        //    OVERLOADING
        print("some string");
        print("another string", 2);
        print(2, "another string again");
        print(5);



    }
}
