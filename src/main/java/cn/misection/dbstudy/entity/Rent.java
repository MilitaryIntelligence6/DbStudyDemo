package cn.misection.dbstudy.entity;

public class Rent {

    private String tid;
    private String zno;
    private String dno;
    private String check_in;
    private String bed;

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    private String pick_out;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getZno() {
        return zno;
    }

    public void setZno(String zno) {
        this.zno = zno;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getPick_out() {
        return pick_out;
    }

    public void setPick_out(String pick_out) {
        this.pick_out = pick_out;
    }
}
