
package iteration;

import java.util.Scanner;


public class Iteration {
    public static float F(float x)
    {
        return (float) (1/Math.sqrt(x+1));
    }

    
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter a value:");
        float a= reader.nextFloat();
        System.out.println("Enter Iteration value:");
        float c=reader.nextFloat();
        float a0=(float)0.0;
        while(Math.abs(F(a)-F(a0))>0.0001 && F(a)!=0.0 && c!=0)
        {
           a0=a;
           a=(float)(F(a));
           c++;
           System.out.printf("%f \n",a);
        }
        System.out.println("The root is:"+a);
        System.out.println("F(float) is:"+F(a));
    }
       
    }

