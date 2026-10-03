
public class ReverseString {
    public static void main(String[] args) {
        String name = "hello";
        String revString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            revString += name.charAt(i);

        }
        System.out.println(revString);
    }

}
