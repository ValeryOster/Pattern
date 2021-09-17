package interview.khorstmann.clone;

import java.time.LocalDate;

public class TestClone implements Cloneable{
    private String str;
    private Integer io;
    private int i;
    private boolean v;
    private Boolean vo;
    private LocalDate localDate;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    protected TestClone clone() throws CloneNotSupportedException {
        return (TestClone)super.clone();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getIo() {
        return io;
    }

    public void setIo(Integer io) {
        this.io = io;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean isV() {
        return v;
    }

    public void setV(boolean v) {
        this.v = v;
    }

    public Boolean getVo() {
        return vo;
    }

    public void setVo(Boolean vo) {
        this.vo = vo;
    }


    @Override
    public String toString() {
        return "TestClone{" +
                "str='" + str + '\'' +
                ", io=" + io +
                ", i=" + i +
                ", v=" + v +
                ", vo=" + vo +
                ", localDate=" + localDate +
                '}';
    }
}
