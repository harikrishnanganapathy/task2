import java.util.Scanner;
class xo
{
    void player(int arr[][],int n,int m,int x,int y)
    {
        Scanner sc=new Scanner(System.in);
        for(x=0;x<m;x++)
        {
            for (y=0;y<n;y++)
            {
                int b=sc.nextInt();
                int c=sc.nextInt();
                if(arr[b][c]==0)
                {
                    System.out.println("enter 2 for x amd 4 for y");
                    int tf=sc.nextInt();
                    if(tf==2)
                    {
                        arr[b][c]=2;
                    }
                    else
                    {
                        arr[b][c]=4;
                    }
                    //System.out.print(arr[x][y]);
                }
                else
                {
                    y=y-1;
                    System.out.println("field is filled");
                }
                for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
                int a=0;
                //while(arr[a][a]==2||arr[a][a]==4)
                //{
                  //  a=a+1;
                //}
                a=0;
                if(arr[a][a]!=0){
                if(arr[a][a]==arr[a+1][a+1]&&arr[a][a]==arr[a+2][a+2])
                {
                    if(arr[a][a]==2)
                    {
                        System.out.println("player x wins");
                }
                    else
                        System.out.println("player y wins");
                }
                }
                for(int i=0;i<m;i++)
                {
                    
                    int j=0;
                    if(arr[i][j]!=0){
                        if(arr[i][j]==arr[i][j+1]&&arr[i][j+1]==arr[i][j+2])
                        {
                            if(arr[i][j]==2)
                            {
                                System.out.println("x won");
                                break;
                            }       
                            else{ 
                                System.out.println("y won");
                            break;
                            }       
                        }
                    
                            }
                }
                for(int k=0;k<n;k++)
                {
                    int l=0;
                    if(arr[k][k]!=0)
                    {
                        if(arr[l][k]==arr[l+1][k]&&arr[l][k]==arr[l+2][k])
                    {
                        if(arr[k][k]==2)
                        {
                            System.out.println("x wins");
                            break;
                        }
                        else
                        {
                            System.out.println("y wins");
                            break;
                        }
                    }
                    }
                }
                int h=2;
                int g=0;
                if(arr[g][h]!=0){
                    if(arr[g][h]==arr[g+1][h-1]&&arr[g][h]==arr[g+2][h-2])
                    {
                    if(arr[g][h]==2)
                    {
                        System.out.println("player x wins");
                }
                    else
                        System.out.println("player y wins");
                }
            }
            }
            
            //System.out.println("");
        }
        //for(int i=0;i<m;i++){
          //  for(int j=0;j<n;j++){
            //    System.out.print(arr[i][j]);
            //}
            //System.out.println("");
        //}
    //int a=0;
               // while(arr[a][a]==2||arr[a][a]==4)
                //{
                  //  a=a+1;
                //}
                //if(a==3)
                //{
                  //  if(arr[a-1][a-1]==2)
                    //{
                      //  System.out.println("player x wins");
                //}
                  //  else
                    //    System.out.println("player y wins");
                //}
                
    }
}
public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        int arr[][]=new int[5][5];  
        int n=3;
        int m=3;
        int x;
        int y=0;
        xo p1=new xo();
        xo p2=new xo();
        for(x=0;x<m;x++)
        {
            for(y=0;y<n;y++)
            {
                arr[x][y]=0;
            }
        }
        for(x=0;x<n;x++){
            for(y=0;y<n;y++){
                System.out.print(arr[x][y]);
            }
            System.out.println("");
        }
        
        p1.player(arr ,n,m,x,y);
        //p2.player();
     }
}