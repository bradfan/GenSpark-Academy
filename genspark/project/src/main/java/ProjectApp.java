public class ProjectApp {
//set up for a mock interview
    public String method(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        ProjectApp project = new ProjectApp();
        System.out.println(project.method("hello"));
    }
}
