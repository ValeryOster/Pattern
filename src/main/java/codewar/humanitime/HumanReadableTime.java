package codewar.humanitime;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int mint = (seconds - hours * 3600) / 60;
        int sec = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, mint, sec);
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(123));
    }
}
