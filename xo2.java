import java.util.*;
import java.lang.*; 
class tictac{
    int f=0,n=3,value,x,y,turn;
    public void display(ArrayList<Integer> pos)
    {
        int position=0;
        for(x=0;x<n;x++)
	{
            for(y=0;y<n;y++)
		{
               System.out.print(pos.get(position));
                position=position+1;
            }
            System.out.println();
        }        
    }
    int a=0,b,c; 
    Scanner sc=new Scanner(System.in);
    public void getinput(ArrayList<Integer> pos)
    {
	do{
            turn=checkifplayersturn();
            System.out.println("enter the position");
            b=sc.nextInt();
            b=b-1;
		
            if(pos.get(b)!=0)
            {
                System.out.println("place is filled");
		a=a-1;
            }
            else
            { 
                if(turn==1)
		{
			c=2;
			turn=turn+1;
		}
		if(turn==0)
		{
			c=4;
			turn=turn+1;
		}
                Integer cwrap=c;
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
	int checkifplayersturn(){
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
    public int check(ArrayList<Integer> pos)
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
			    System.exit(0);
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
				  System.exit(0);
                            }
			}
                    }
		}po=po+1;
            }
        }
			int posi=0;
			int cnt=0;
			int ct=0;
			for(int k=0;k<9;k++)
        		{
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
int g=0;
        int j;
        for(int i=0;i<n;i++)
        { positi=i;
            for(j=0;j<n;j++)
            {
                	if(pos.get(positi)==2){
                		cont=cont+1;
                		if(cont==3){
                    			System.out.println("x wi");
                    			f=1;
                		}
            		}	
            		else{
                		if(pos.get(positi)==4){		
                    			ycont=ycont+1;
                    			if(ycont==3){
                        			System.out.println("y wi");
                        			f=1;
                    			}
                		}		
            		}
        		positi=positi+3;
            }
	    cont=0;
	    ycont=0;
        } 
        return f;
    }
}
public class xo2{
    public static void main(String [] args){
        int n=3;
        int m=3;
        int x;
        int y;
        tictac p1=new tictac();
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
        p1.display(pos);
        p1.getinput(pos);
        p1.check(pos);
     }
}
