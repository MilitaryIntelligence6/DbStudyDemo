package cn.misection.dbstudy.entity;

/**
 * 课程类
 */

public class Course {
    private int cno;
    private String cname;
    private int cpno;
    private int credit;

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCpno() {
        return cpno;
    }

    public void setCpno(int cpno) {
        this.cpno = cpno;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
