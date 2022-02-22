public class ProjectApp {
    //set up for a mock interview
    public String method(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public String fizzBuzz(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result += "FizzBuzz" + " ";
            } else if (i % 5 == 0) {
                result += "Buzz" + " ";
            } else if (i % 3 == 0) {
                result += "Fizz" + " ";
            } else result += i + " ";
        }
        return result;
    }


    public static void main(String[] args) {
        ProjectApp project = new ProjectApp();
        System.out.println(project.method("always in reverse, like the French Army"));
        System.out.println(project.fizzBuzz(45));
    }
}
