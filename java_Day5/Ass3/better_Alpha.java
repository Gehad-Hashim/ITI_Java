import java.util.*;
public class better_Alpha{

    interface Len_test{
        boolean compare(String str1 ,String str2);
    }
    interface G_test{
        boolean compare(String str1 ,String str2);
    }
    interface is_Alpha{
        boolean test(String str1);
    }

    public static String better_string(String s1 ,String s2,Len_test l){
        if (l.compare(s1,s2)){
            return s1;
        }
        else
        {
            return s2;
        }
    }
    public static String better_string(String s1 ,String s2, G_test g){
        if (g.compare(s1,s2)){
            return s1;
        }
        else
        {
            return s2;
        }
    }



    public static void main(String arg[]){

        System.out.println("hi Day5 Ass3 ");
        Len_test l1=(s1,s2) -> s1.length() >s2.length();
        // G_test l2=(s1,s2) -> s1=="Gehad";
        G_test l2=(s1,s2) -> s1=="any name";

        System.out.println(better_string("eeeeeeeeeeeeee","yyy",l1));
        System.out.println(better_string("Gehad","not Gehad",l2));

                    is_Alpha l3=(s)->{
                        for(int i=0;i<s.length();i++)
                        {
                            if(!Character.isLetter(s.charAt(i))){
                                return false;
                            }
                        }
                        return true;
                    };

        System.out.println(l3.test("learnJava")); //true means ia alpha
        System.out.println(l3.test("learn Java")); //false because of space


    }




}
