package aufgaben.glava1.a10;

public class ChangeoverAllOpportunity {
    static String a = "";

    public static void main(String[] args) {
        permuteAndPrint("", "abc");

    }

    public static void permuteAndPrint(String prefix, String str) {
        int n = str.length();

        if (n == 0) {
//            System.out.println(prefix + " ");
        } else {a += "-";
            for (int i = 0; i < n; i++) {

                System.out.println(a + "" + prefix + str.charAt(i) + ", " + str.substring(i + 1, n) + str
                        .substring(0, i));
                permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }
}
