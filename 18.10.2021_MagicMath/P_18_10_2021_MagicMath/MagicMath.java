package P_18_10_2021_MagicMath;

public class MagicMath {
    //private int a;
    //private int b;
   // public MagicMath(int a, int b){
     //  this.a = a;
    //   this.b = b;
    //}
   public MagicMath(){
        }
   public int fact(int a){
       int ans =1;
       if (a > 1)
           for(int i =1;i<=a;i++){
             ans *=i;
           }
       return ans;
    }


    public int abs(int a){
       if (a<0) return 0-a;
       else return a;
    }

    public int pov(int a, int b){
        int ans =1;
        for (int i=0;i<b;i++){
            ans*= a;

        }
        return ans;
    }
}
