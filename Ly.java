import java.util.*;
class leap{
    int yr;
    void leapyr(){
        Scanner sc=new Scanner(System.in);
        yr=sc.nextInt();
        if(yr%400==0)
        {
            System.out.print("leap year");}
        else if(yr%4==0&&yr%100!= 0)
            {
                System.out.print("leap year");
            }
        else{
            System.out.print("not a leap year");
        }
    }
}
public class Ly{

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        leap y=new leap();
        y.leapyr();
    }
}