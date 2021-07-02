package cn.misection.dbstudy.entity;

public class Employee {

    private String eno;

    private String zno;

    private String ename;

    private int eage;

    private String esex;

    private String position;

    private String econtact;

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getZno() {
        return zno;
    }

    public void setZno(String zno) {
        this.zno = zno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEcontact() {
        return econtact;
    }

    public void setEcontact(String econtact) {
        this.econtact = econtact;
    }
}
