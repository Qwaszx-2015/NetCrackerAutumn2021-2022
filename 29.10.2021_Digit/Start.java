import P_20_10_2021_Calculator.*;
import P_18_10_2021_MagicMath.*;
import P_25_10_2021_User.User;
import P_25_10_2021_User.Role;
import P_29_10_2021_Student.*;
import P_29_10_2021_Digit.*;

public class Start {
    public static void main(String[] args){
        int n1 = 5, n2 =3;
        //System.out.println();
        /////////////////////////////////////////////////////////////////////////////////////////////
        /*
                // MagicMath
        MagicMath test_1 = new MagicMath();
        System.out.println(test_1.abs(n1));
        System.out.println(test_1.fact(n1));
        System.out.println(test_1.pov(n1,n2));
        System.out.println();
        */
        ////////////////////////////////////////////////////////////////////////////////////////////
        /*
                    //Calculator
        Add_2int add_1 = new Add_2int();
        Subtraction_2int sub_1 = new Subtraction_2int();
        Multiplication_2int mul_1 = new Multiplication_2int();
        Division_2int div_1 = new Division_2int();
        Calculator Cal_1 = new Calculator(add_1,sub_1,mul_1,div_1);
        System.out.println(Cal_1.getAdd_().action(n1,n2));
        System.out.println(Cal_1.getSub_().action(n1,n2));
        System.out.println(Cal_1.getMul_().action(n1,n2));
        System.out.println(Cal_1.getDiv_().action(n1,n2));

         */
        ///////////////////////////////////////////////////////////////////////////////////////////
        /*
                     //User

        Role[] List_1 = {new Role("Ludovic 2","King"),new Role("Gerri Mask","Commoner")
                ,new Role("Frans Mockingbird","thinker")};
        User Test_1 = new User(1,"Marc Cipher","12345", List_1);
        Test_1.toStringClass();

         */
        //////////////////////////////////////////////////////////////////////////////////////////
        /*
                   // Student
        String Test_Name = "Иванов Иван Иванович";
        Student Test_s_1 = new Student(Test_Name);
        Test_s_1.setNumber_St(1000);
        Test_s_1.setTrend("Ивановедение");
        Magistrant Test_m_1 = new Magistrant(Test_Name);
        Test_s_1.Op();
        Test_m_1.Op();

        Magistrant Test_m_2 = new Magistrant(Test_s_1.getLong_Name(),Test_s_1.getNumber_St(),"Углубленное Ивановедение",Test_s_1.getTrend());

        Test_m_2.Op();
        */
        //////////////////////////////////////////////////////////////////////////////////////////



        ///*
                   // Digit
        long n3 = 1234400001;
        double n4 = 12.23;
        Digit<Integer> Test_1 = new Digit<Integer>(n1);
        Digit<Long> Test_2 = new Digit<Long>(n3);
        Digit<Double> Test_3 = new Digit<Double>(n4);



        System.out.println(Test_1.get_int());
        System.out.println(Test_1.get_double());
        System.out.println(Test_1.get_float());
        System.out.println(Test_1.get_byte());
        System.out.println(Test_1.get_string());
        System.out.println(Test_1.get_long());
        System.out.println("++++++++++++++++++++++++++++++");

        System.out.println(Test_2.get_int());
        System.out.println(Test_2.get_double());
        System.out.println(Test_2.get_float());
        System.out.println(Test_2.get_byte());
        System.out.println(Test_2.get_string());
        System.out.println(Test_2.get_long());
        System.out.println("++++++++++++++++++++++++++++++");

        System.out.println(Test_3.get_int());
        System.out.println(Test_3.get_double());
        System.out.println(Test_3.get_float());
        System.out.println(Test_3.get_byte());
        System.out.println(Test_3.get_string());
        System.out.println(Test_3.get_long());
        System.out.println("++++++++++++++++++++++++++++++");


         //*/


    }
}

