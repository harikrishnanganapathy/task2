import java.util.*;
class tictac{
    int n;
    int value;
    int x;
    int y;
    public void display(ArrayList<Integer> pos)
    {
        int position=0;
        for(x=0;x<n;x++){
            for(y=0;y<n;y++){
               System.out.print(pos.get(position));
                position=position+1;
            }
            System.out.println();
        }        
}
    int b; 
    int c;
    Scanner sc=new Scanner(System.in);
    public void getinput(ArrayList<Integer> pos)
    {
        
        //do{
            //display(pos);
            System.out.println("enter the position");
            b=sc.nextInt();
            b=b-1;
            if(pos.get(b)!=0)
            {
                System.out.println("place is filled");
            }
            else
            { 
                System.out.println("enter 2 for x and 4 for o");
                c=sc.nextInt();
                Integer cwrap=c;
                    pos.set(b,cwrap);
                    check(pos);
            }
        //}while(pos.contains(0));
        //System.out.println("draw! game ends");
    }
    public void check(ArrayList<Integer> pos)
    {
        int po=0;
        int count=0;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                po=po+1;
                if(i==j){
                    if(pos.get(po)==2)
                    {
                        count=count+1;
                        if(count==3)
                        {
                            System.out.println("x wins");
                        }
                    }
                    else if(pos.get(po)==4)
                    {
                        flag=flag+1;
                        if(flag==3)
                        {
                            System.out.println("y wins");
                        }
                    }
                    }
            }
        }
    }
}
public class xo{

    /**
     *
     * @param args
     */
    public static void main(String []args){
        //System.out.println("Hello World");
        //int arr[][]=new int[5][5];  
        int n=3;
        int m=3;
        int x;
        int y;
        tictac p1=new tictac();
        //xo p2=new xo();
    //    for(x=0;x<m;x++)
      //  {
        //    for(y=0;y<n;y++)
          //  {
          //int position=0;
         ArrayList<Integer>pos =new ArrayList<Integer>();
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
    pos.add(0);
                //arr[x][y]=0;
            //}
        //}
do{
     p1.display(pos);
    p1.getinput(pos);
     p1.check(pos);
        //p2.player();
}while(pos.contains(0));
     }
}
