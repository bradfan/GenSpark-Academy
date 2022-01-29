import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChallengeStorage {


    public static void writeOutputOneFile() throws IOException {
        var getInputOne = Files.lines(Paths.get("out/production/sandbox/file_practice.txt")).collect(Collectors.toList());
        System.out.println(getInputOne);
        int lastIndex = getInputOne.size();
        System.out.println(lastIndex);
        int halfwayIndex = (lastIndex / 2);
        if(getInputOne.size() % 2 == 0 == false) {
               halfwayIndex += 1;
        }
        System.out.println(halfwayIndex);

        List<String> together = new ArrayList<>();
//        together = getInputOne.stream().reduce("", (e1,e2) -> )


        System.out.println(together);
        var outputOne = Files.write(Paths.get("output_one.txt"), together, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

//    List<String> a = new ArrayList<>();
//            List<String> b = new ArrayList<>();
//            for (int i = 0; i <= halfwayIndex; i++) {
//                a.add(getInputOne.get(i));
//            }
//        System.out.println("A: " + a);
//            for (int i = halfwayIndex + 1; i <= lastIndex; i++) {
//                b.add(getInputOne.get(i));
//            }
//      System.out.println("B: " + b);


//        public static void writeOutputTwoFile() throws IOException {
//            var getInputTwo = Files.lines(Paths.get("src/java/file_practice.txt")).collect(Collectors.toList());
//            System.out.println(getInputTwo);
//            List<String> f = new ArrayList<>();
//            int start = 0;
//            int counter = 0;
//            while(start < 8) {
//                f.add(getInputTwo.get(counter));
//               counter += 9;
//                if(counter > getInputTwo.size() - 1) {
//                    start ++;
//                    counter = start;
//                }
//            }
//            System.out.println("F: " + f);
//
//             Files.write(Paths.get("output_two.txt"), f, StandardCharsets.UTF_8,
//                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//        }

    public static void main(String[] args) throws IOException {

        writeOutputOneFile();


    }


}
