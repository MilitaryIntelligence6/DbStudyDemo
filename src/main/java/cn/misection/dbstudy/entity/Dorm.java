package cn.misection.dbstudy.entity;

/*寝室信息*/
public class Dorm {

    private String zno;

    private String dno;

    private String contain;

    private int electricity;

    private int water;

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

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
}
