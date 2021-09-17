package interview.khorstmann.anderes;

public class AA {
    private AA aa;

    public AA() {
    }

    public AA(BB bb) {
        this.aa = bb;
    }

    public String AAstring() {
        return "AAstring";
    }

    public String aString() {
        return aa.AAstring();
    }
}
