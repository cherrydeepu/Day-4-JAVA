import java.util.*;
public class ageofaperson{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int flag=0;
        if(a>=10)
        flag=1;
        switch(flag)
        {
            case 0:
                System.out.println("Not Eligible");
                break;
            case 1:
                System.out.println("Eligible");
                break;
        }
    }
}