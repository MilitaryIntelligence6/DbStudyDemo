package cn.misection.dbstudy.entity;

//宿舍园区
public class Zone {

    //
    private String zno;

    private String zname;

    private String sex;

    private int fee;

    private String accommodation;

    private int remain;

    public String getZno() {
        return zno;
    }

    public void setZno(String zno) {
        this.zno = zno;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }
}
