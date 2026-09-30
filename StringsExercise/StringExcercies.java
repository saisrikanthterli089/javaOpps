package StringsExercise;

public class StringExcercies {
    public static void main(String[] args) {
        String s = "Hello World";

// System.out.println(s.length());
// System.out.println(s.charAt(0));
// System.out.println(s.indexOf("World"));
// System.out.println(s.contains("Hello"));
// System.out.println(s.toLowerCase());

String ds = "hello Master#444**(";

String res = ds.replaceFirst("[^0-9]", "");
String des = ds.replaceAll("[^a-z0-9A-z]", "");
System.out.println(des);
    }
}
