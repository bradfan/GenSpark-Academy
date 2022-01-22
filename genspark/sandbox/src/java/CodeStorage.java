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


