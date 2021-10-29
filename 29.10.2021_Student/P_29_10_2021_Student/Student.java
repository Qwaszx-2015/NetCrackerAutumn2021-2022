package P_29_10_2021_Student;

public class Student {
    private String Long_Name;
    private int Number_St;
    private String Trend;


    {
        System.out.println(" Учётная запись создана.");
    }
    public void Op(){
        System.out.println(" Учётная запись на пользованеля "+ this.Long_Name + " создана.");
    }

    public Student(String name){
        this.Long_Name = name;
    }

    public Student(String name,int num,String trend){
        this(name);
        this.Number_St = num;
        this.Trend = trend;
    }

    public String getLong_Name() {
        return Long_Name;
    }

    public int getNumber_St() {
        return Number_St;
    }

    public String getTrend() {
        return Trend;
    }

    public void setLong_Name(String long_Name) {
        this.Long_Name = long_Name;
    }

    public void setNumber_St(int number_St) {
        this.Number_St = number_St;
    }

    public void setTrend(String trend) {
        this.Trend = trend;
    }
}
