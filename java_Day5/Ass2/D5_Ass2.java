import java.util.*;
 class Complex<T extends Number>{
    public T realPart;
    public T imgPart;

    public Complex(T real,T img){
        this.realPart=real;
        this.imgPart=img;
    }

    // @override
    public void display(){
         System.out.println( this.realPart + "+" +this.imgPart+"i");
    }
    
}
class complexOperations{
//  Add operation

public static  <T extends Number> Complex<T> add(Complex<T> num1,Complex<T> num2 )
{
double real1=num1.realPart.doubleValue();
double img1=num1.imgPart.doubleValue();

double real2=num2.realPart.doubleValue();
double img2=num2.imgPart.doubleValue();

T r=(T) new Double(real1+real2);
T i=(T)new Double(img1+img2);
    return new Complex<T>(r,i)     ;        
}
// -----------------------------------------------
//  Subtraction operation

public static  <T extends Number> Complex<T> sub(Complex<T> num1,Complex<T> num2 )
{
int real1=num1.realPart.intValue();
int img1=num1.imgPart.intValue();

int real2=num2.realPart.intValue();
int img2=num2.imgPart.intValue();

T r=(T) new Integer(real1-real2);
T i=(T)new Integer(img1-img2);
    return new Complex<T>(r,i)     ;        
}



     public static void main(String args[]){
         System.out.println("hi day 5 Ass2");

        Complex com1=new Complex(5,6);
        Complex com2=new Complex(4,3);

        com1.display();
        com2.display();

        Complex com3=add(com1,com2);
        com3.display();
        
        Complex com4=sub(com1,com2);
        com4.display();
     }
 }