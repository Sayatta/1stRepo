import java.util.*;
class rps_game
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double comp;
        char c1;
        System.out.println("Enter name of player:");
        String name=in.next();
        System.out.println("Enter number of points between 1 and 10");
        int n=in.nextInt();
        while(n<1 || n>10)
        {
            System.out.println("Please enter points between 1 and 10");
            n=in.nextInt();
        }
        int i=0,pc=0,pp=0;
        while(i<n)
        {
            comp=Math.random()*100;
            if(comp<=33.3)
                c1='R';
            else if(comp>33.3 && comp<=66.6)
                c1='P';
            else
                c1='S';
            System.out.println("\nTurn "+(i+1));
            System.out.println("Enter 'R' for Rock");
            System.out.println("Enter 'P' for Paper");
            System.out.println("Enter 'S' for Scissors");
            char c=in.next().charAt(0);
            switch(c)
            {
                case 'R': if(c==c1)
                              System.out.println("Draw");
                          else if(c<c1)
                          {
                              System.out.println(name+" Wins");
                              pp++;
                          }
                          else
                          {
                              System.out.println("Computer Wins");
                              pc++;
                          }
                          break;
                case 'P': if(c==c1)
                              System.out.println("Draw");
                          else if(c1-c==2)
                          {
                              System.out.println(name+" Wins");
                              pp++;
                          }
                          else
                          {
                              System.out.println("Computer Wins");
                              pc++;
                          }
                          break;
                case 'S': if(c==c1)
                              System.out.println("Draw");
                          else if(c-c1!=1)
                          {
                              System.out.println(name+" Wins");
                              pp++;
                          }
                          else
                          {
                              System.out.println("Computer Wins");
                              pc++;
                          }
                          break;
                default:  System.out.println("Wrong character entered");
                          System.out.println("Please enter correct character:");
                          i--;
            }
            System.out.println();
            i++;
        }
        System.out.println("\n"+name+": "+pp+" POINTS");
        System.out.println("Computer: "+pc+" POINTS");
        if(pp>pc)
            System.out.println(name+" Wins");
        else if(pc>pp)
            System.out.println("Computer Wins");
        else
        System.out.println("DRAW");
    }
}