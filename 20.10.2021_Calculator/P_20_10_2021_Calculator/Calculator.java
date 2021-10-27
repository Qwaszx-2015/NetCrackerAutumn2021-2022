package P_20_10_2021_Calculator;

public class Calculator {
    private Add_2int Add_ = new Add_2int();
    private Subtraction_2int Sub_;
    private Multiplication_2int Mul_;
    private Division_2int Div_;

    public Calculator(Add_2int a1, Subtraction_2int a2, Multiplication_2int a3, Division_2int a4){
        this.Add_ = a1;
        this.Sub_ = a2;
        this.Mul_ = a3;
        this.Div_ = a4;
    }

    public Add_2int getAdd_(){
        return Add_;
    }
    public Subtraction_2int getSub_(){
        return Sub_;
    }
    public Multiplication_2int getMul_(){
        return Mul_;
    }
    public Division_2int getDiv_(){
        return Div_;
    }

    public void setAdd_(Add_2int n){
        this.Add_ = n;
    }
    public void setSub_(Subtraction_2int n){
        this.Sub_ = n;
    }
    public void setMul_(Multiplication_2int n){
        this.Mul_ = n;
    }
    public void setDiv_(Division_2int n){
        this.Div_ = n;
    }






}
