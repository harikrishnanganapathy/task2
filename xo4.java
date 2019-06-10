import java.util.*;
public class xo4{
 static int turn=0;
public static void main(String [] args){
ArrayList<Integer> pos = new ArrayList<Integer>(9);
    pos.add(0);   
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
    display(pos);
    getinput(pos);
        //p2.player();
     }
   static int f=0;
   static int n=3;
static int a=0;
    int value;
public static void display(ArrayList<Integer> pos )
    {
        int position=0;
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
                {
               System.out.print(pos.get(position));
                position=position+1;
            }
            System.out.println();
        }
}
    public static void getinput(ArrayList<Integer> pos)
    {
int c=1;
Scanner sc=new Scanner(System.in);
do{
        turn=checkifplayersturn();
            System.out.println("enter the position");
           int b=sc.nextInt();

            b=b-1;

            if(pos.get(b)!=0)
            {
                System.out.println("place is filled");
                a=a-1;
            }
            else
            {
             //   System.out.println("enter 2 for x and 4 for o");
                if(turn==1)
                {
                        c=2;
                        //turn=turn+1;
                }
                if(turn==0)
                {
                        c=4;
                        //turn=turn+1;
                }
                Integer cwrap = c;
                    pos.set(b,cwrap);
                    check(pos);
            }
                display(pos);
                f=check(pos);
                if(f==1)
                {
                    break;
                }
a=a+1;
        }while(pos.contains(0));
        if(f==0)
        {
            System.out.println("draw! game ends");
        }
   }
public static int checkifplayersturn(){
                if(a%2==0)
                {
                        System.out.println("x's turn");
		turn=1;

                }
                else
                {
                        System.out.println("y's turn");
                turn=0;
                }
return turn;
        }
public static int check(ArrayList<Integer> pos)
    {
        int po=0;
        int count=0;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j){
                    if(pos.get(po)==2)
                    {
                        count=count+1;
                        if(count==3)
                        {
                            System.out.println("x wins");
                            f=1;
                        }
                    }
                    else
                        { if(pos.get(po)==4)
                                {
                        flag=flag+1;
                        if(flag==3)
                        {
                            System.out.println("o wins");
                            f=1;
                        }}
                    }
        }po=po+1;
            }
        }
                        int posi=0;
                        int cnt=0;
                        int ct=0;
                        for(int k=0;k<9;k++)
                        {//posi=posi+2;
                                {
                                        if(posi%2==0){
                                            if((posi!=0)&&(posi!=8))
                                            {
                                                if(pos.get(posi)==2)
                                                {
                                                cnt=cnt+1;
                                                        if(cnt==3)
                                                        {
                                                        System.out.println("x won");
                                                        f=1;
                                                        }
                                                }
                                            //}
                                                else{
                                                        if(pos.get(posi)==4)
                                                        {
                                                                ct=ct+1;
                                                                if(ct==3)
                                                                        {

									System.out.println("o won");
                                                                        f=1;
                                                                        }
                                                                }
                                                }
                                        }
                                        }
                                posi=posi+1;
                                }
                        }
int posit=0;
        for(int i=0;i<n;i++)
        {
            int countt=0;
            int cot=0;
                for(int j=0;j<n;j++){
                        if(pos.get(posit)==2){
                                countt=countt+1;
                                        if(countt==3)
                                        {
                                        System.out.println("x win");
                                        f=1;
                                        }
                                }
                                else
                                {if(pos.get(posit)==4){
                                        cot=cot+1;
                                        if(cot==3){
                                                System.out.println("y win");
                                        f=1;}
                                }

                        }posit=posit+1;
                }
        }
        int cont=0;
        int positi=0;
        int ycont=0;
//int positi=0;
        int j=0;
        for(int i=0;i<n;i++)
        {positi=i;
            for(j=0;j<9;j=j+3)
            {//positi=positi+i;
if(positi==j){
                    if(pos.get(j)==2)
            {   positi=j+3;
                cont=cont+1;
                if(cont==3)
                {
                    System.out.println("x wi");
                    f=1;
                }
            }
            else
            {
                if(pos.get(positi)==4)
                {
                        positi=j+3;
                    ycont=ycont+1;

if(ycont==3)
                    {
                        System.out.println("y wi");
                        f=1;
                    }
                }
            }
        //positi=positi+3;
            }
        }
        }
        return f;
 }

}
