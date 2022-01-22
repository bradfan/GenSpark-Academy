import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

    public float ticketPrice(int mileage) {
        float price = (float) (mileage * .15);
        return price;
    }

   public float discount(int price) {
       int adjPrice = price;
       if(getAge <= 12) {
           adjPrice = (int) (price * .5);
           return adjPrice;
       }
       if(getAge >= 60) {
           adjPrice = (int) (price * .4);
       }
       if(getGender.equals("F") && getAge > 12 && getAge < 60) {
           adjPrice = (int) (price * .75);
       }
       return adjPrice;
   }



//public class FindMissingInteger implements Assignment {
//    public int solution(ArrayList<Integer> numbers) {
//        // ↓↓↓↓ your code goes here ↓↓↓↓
//        System.out.println("given array list: " + numbers);
//        if (numbers.isEmpty() == true) {
//            return 0;
//        } else if(numbers.size() == 1 && numbers.get(0).equals(2) ) {
//            return 1;
//        } else if (numbers.get(0).equals(2)) {
//            return 1;
//        }
//        for (int i = numbers.size() - 1; i > 0;  i--)
//            if (numbers.get(i) != (numbers.get(i - 1) + 1))
//                return numbers.get(i) - 1;
//        return 0;
//    }
//}

//    public static void main(String[] args) {
//        Encapsulation e = new Encapsulation();
//        e.setAge(18);
//        e.setName("Bill");
//        Abstraction a = new Abstraction();
//        a.setAge(18);
//        a.setName("Bill");
//        int years = a.yearsUntil25();
//        System.out.println("Age: " + e.getAge());
//        System.out.println("Name: " + a.getName());
//        System.out.println("How many years until " + e.getName() + " is 25 years old? " + years + " years.");


    }




//    public static List<Integer> minMax(List<Integer> nums) {
////        List<Integer> myArray = new ArrayList<>();
////        if(nums.size() == 0) {
////            myArray.add(0);
////            myArray.add(0);
////        }
////        int max = nums.get(0);
////        int min = nums.get(0);
////        for(int i = 1; i < nums.size() - 1; i++) {
////            if(nums.get(i) > max) {
////                max = nums.get(i);
////            }
////            if(nums.get(i) < min) {
////                min = nums.get(i);
////            }
////            myArray.add(max);
////            myArray.add(min);
////        }
////        return myArray;
////    }