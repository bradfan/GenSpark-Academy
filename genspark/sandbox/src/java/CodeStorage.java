import static java.lang.Integer.parseInt;

public class CodeStorage {

    //take user input and turn it into minutes from 00:00
    public int convertHours(String input) {
        String[] s = input.split(":");
        int hours = parseInt(s[0]) * 60;
        int departureMinutes = hours + parseInt(s[1]);
        System.out.println(departureMinutes);
        return departureMinutes;
    }

    //    add minutes from 00:00 add flight time subtract time zone difference
    public int etaCalc(int departureMinutes, int grossTravel, int zoneTime) {
        int rawEta = departureMinutes + grossTravel + zoneTime;
        return rawEta;
    }
    // take the minutes from when the user lands and convert it to a readable time.
    public String convertHoursBack(int rawEta) {
        double firstLevel = (double) rawEta / 60;
//        trim off the decimal
        String asString = String.valueOf(firstLevel);
        int indexOfDecimal = asString.indexOf(".");
        //        and return it as a string.
        String hour = asString.substring(0, indexOfDecimal);
        String decimalMinute = asString.substring(indexOfDecimal, asString.length());
        //        and multiply that by 60,
        float intMinute = Float.parseFloat(decimalMinute) * 60;
        System.out.println(intMinute);
        String minute = String.valueOf(intMinute).replace(".", "");
        //        reattach it to the int before the decimal
        String arrivalTime = hour + ":" + minute;
        System.out.println("Arrival: " + arrivalTime);
        return arrivalTime;


    }

}

//    public void writeOutputOneFile() throws IOException {
////        var getInputOne = Files.lines(Paths.get("input_1.txt")).collect(Collectors.toList());
////        System.out.println(getInputOne);
////        int halfwayIndex = (getInputOne.size() / 2);
////        List<String> a = new ArrayList<>();
////        List<String> b = new ArrayList<>();
////       for(int i = 0; i <= halfwayIndex; i++) {
////           a.add(getInputOne.get(i));
////       }
////       for(int i = halfwayIndex + 1; i <= getInputOne.size()-1; i++) {
////           b.add(getInputOne.get(i));
////       }
////        System.out.println("A: " + a);
////        System.out.println("B: " + b);
////
//////        var oneData = getInputOne.stream().map(i -> i.concat()).collect(Collectors.toList());
//////       var outputOne = Files.write(Paths.get("output_one.txt"), oneData, StandardCharsets.UTF_8,
//////              StandardOpenOption.APPEND);
