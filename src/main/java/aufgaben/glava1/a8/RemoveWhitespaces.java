package aufgaben.glava1.a8;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        String a = " asödkf aölkdsf aldksfj ";

        String s = a.replaceAll("\\s", "");
        System.out.println(s);
    }
}
