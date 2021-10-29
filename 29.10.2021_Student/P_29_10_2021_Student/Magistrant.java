package P_29_10_2021_Student;

public class Magistrant extends Student{
    private String Trend_Bac;

    public Magistrant(String name) {
        super(name);
    }
    public Magistrant(String name, int num, String trend,String tr_b) {
        super(name, num, trend);
        this.Trend_Bac = tr_b;
    }

    public String getTrend_Bac() {
        return Trend_Bac;
    }

    public void setTrend_Bac(String trend_Bac) {
        this.Trend_Bac = trend_Bac;
    }

}
