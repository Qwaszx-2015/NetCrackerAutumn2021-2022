package P_20_10_2021_Calculator;


public class Division_2int   implements Do_{

    public Division_2int(){

    }
    @Override
    public double action(int a1, int a2) {
        double ans = a1*100/a2;
        int prov = a1*1000/a2;
        if (prov%10>=5) ans+=1;

        return ans/100;
    }
}
