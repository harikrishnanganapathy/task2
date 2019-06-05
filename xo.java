import java.util.*;
class tictac{
    int n;
    int value;
void display(ArrayList<Integer> pos){
    int posi=0;
for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
               System.out.print(pos.get(posi));
                posi=posi+1;
            }
            System.out.println();
        }
        //p2.player();
}
    int b; 
    int c;
    void getinput(ArrayList<Integer> pos)
    {
        Scanner sc=new Scanner(System.in);
        do{
            b=sc.nextInt();
            c=sc.nextInt();
           Integer cwrap=new Integer(c);
            if(pos.get(b)!=0)
            {
                System.out.println("place is filled");
            }
            else
            { 
                    pos.set(b,cwrap)=b;
            }
        }while(pos!=0);
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
          int position=0;
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
        
        p1.display(pos);
 p1.getinput(pos);
        //p2.player();
     }
}
