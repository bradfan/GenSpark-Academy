import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChallengeStorage {

    public void writeOutputOneFile() throws IOException {
            var getInputOne = Files.lines(Paths.get("input/one_to_seven.txt")).collect(Collectors.toList());
            System.out.println(getInputOne);
            int halfwayIndex = (getInputOne.size() / 2);
            int lastIndex = getInputOne.size() - 1;
            List<String> a = new ArrayList<>();
            List<String> b = new ArrayList<>();
            for (int i = 0; i < halfwayIndex; i++) {
                a.add(getInputOne.get(i));
            }
            for (int i = halfwayIndex; i <= lastIndex; i++) {
                b.add(getInputOne.get(i));
            }
            List<String> together = new ArrayList<>();
            for (int i = 0; i <= a.size() - 1; i++) {
                together.add(a.get(i) + " " + b.get(i));
            }
//        var outputOne = Files.write(Paths.get("output_one.txt"), together, StandardCharsets.UTF_8,
//                StandardOpenOption.APPEND);
        }

        public void writeOutputTwoFile() throws IOException {
            var getInputTwo = Files.lines(Paths.get("input/one_to_twenty_five.txt")).collect(Collectors.toList());
            System.out.println(getInputTwo);
            List<String> a = new ArrayList<>();
            List<String> b = new ArrayList<>();
            List<String> c = new ArrayList<>();
            List<String> d = new ArrayList<>();
            List<String> e = new ArrayList<>();
            List<String> f = new ArrayList<>();

            for (int i = 0; i <= getInputTwo.size() - 1; i += 9) {
                a.add(getInputTwo.get(i));
                f.add(getInputTwo.get(i));

            }
            for (int i = 1; i <= getInputTwo.size() - 1; i += 9) {
                a.add(getInputTwo.get(i));
                f.add(getInputTwo.get(i));

            }
            for (int i = 2; i <= getInputTwo.size() - 1; i += 9) {
                b.add(getInputTwo.get(i));
                f.add(getInputTwo.get(i));

            }
            for (int i = 3; i <= getInputTwo.size() - 1; i += 9) {
                b.add(getInputTwo.get(i));
                f.add(getInputTwo.get(i));

            }
            for (int i = 4; i <= getInputTwo.size() - 1; i += 9) {
                c.add(getInputTwo.get(i));
                f.add(getInputTwo.get(i));

            }
            for (int i = 5; i <= getInputTwo.size() - 1; i += 9) {
                c.add(getInputTwo.get(i));
                f.add(getInputTwo.get(i));

            }
            for (int i = 6; i <= getInputTwo.size() - 1; i += 9) {
                d.add(getInputTwo.get(i));
                f.add(getInputTwo.get(i));
            }
            for (int i = 7; i <= getInputTwo.size() - 1; i += 9) {
                d.add(getInputTwo.get(i));
                f.add(getInputTwo.get(i));
            }
            for (int i = 8; i <= getInputTwo.size() - 1; i += 9) {
                e.add(getInputTwo.get(i));
                f.add(getInputTwo.get(i));
            }

            System.out.println("A: " + a);
            System.out.println("B: " + b);
            System.out.println("C: " + c);
            System.out.println("D: " + d);
            System.out.println("E: " + e);
            System.out.println("F: " + f);

            var outputTwo = Files.write(Paths.get("output_two.txt"), f, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }




}
