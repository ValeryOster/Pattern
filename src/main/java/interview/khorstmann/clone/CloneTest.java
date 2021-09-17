package interview.khorstmann.clone;

import java.time.LocalDate;

public class CloneTest {
    public static void main(String[] args){

        TestClone a = new TestClone();
        a.setI(2);
        a.setIo(3);
        a.setStr("hallo");
        a.setV(true);
        a.setVo(false);
        a.setLocalDate(LocalDate.now());

        TestClone ab = null;
        try {
            ab = a.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ab.setStr("chao chao");
        System.out.println(ab);
        System.out.println(a);
    }
}
