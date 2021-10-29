package P_29_10_2021_Digit;

public class Digit<T extends Number> {
    private T val;

    public Digit(T v){
        this.val = v;
    }

    public Integer get_int(){
        double b = Double.valueOf(String.valueOf(val));
        int a =  (int) b;
        return a;
    }
    public Double get_double(){
        double a =  Double.valueOf(String.valueOf(val));
        return a;
    }
    public Float get_float(){
        float a =  Float.valueOf(String.valueOf(val));
        return a;
    }
    public Long get_long(){
        double b = Double.valueOf(String.valueOf(val));
        long  a =  (long) b;
        return a;
    }
    public Byte get_byte(){
        double b = Double.valueOf(String.valueOf(val));
        int b1 =  (int) b;

        if (b1 < -128 || b1 > 127)
            b1%=128;
        Byte a =  Byte.valueOf(String.valueOf(b1));
        return a;
    }
    public String get_string(){
        String a = String.valueOf(val);
        return a;
    }



}
