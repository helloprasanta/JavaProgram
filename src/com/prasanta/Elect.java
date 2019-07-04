package com.prasanta;

import java.io.*;

class  Elect
{
    public static void main(String args[]) 
    {
         int Candidate[]=new int[6];
        int SpoiltBallot=0;
        int voters;
        int check=0,winner=1,badlooser=1;
        String str;

        try{
             BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("\n=====ELECTION BOARD=====\n");
             System.out.print("\nEnter number of voters appeared for voting : ");
             System.out.flush();
             str=obj.readLine();
             voters=Integer.parseInt(str);

    loop: for(int i=1;i<=voters;i++)
             {
                    System.out.print("\nVote given by voter("+i+") to Candidate Id : ");
                    System.out.flush();
                    str=obj.readLine();
                    check=Integer.parseInt(str);

                    if (check<1 && check>5)
                    {
                            SpoiltBallot=SpoiltBallot+1;
                            continue loop;
                    }
                    else
                    {
                            Candidate[check]=Candidate[check]+1;
                    }
            }

            System.out.println("\nVOTING RESULT ARE AS UNDER");
            for(int i=1;i<=6;i++)
            {
                 System.out.println("CANDIDATE ID : "+i+" has recieved  "+Candidate[i]+" Votes");
            }

            for(int i=1;i<=5;i++)
            {
                 for(int j=1;j<=5;j++)
                 {
                         if(i==1)
                          {
                             winner=i;
                             badlooser=i;
                          }

                          else if(Candidate[i]<Candidate[j])
                          {
                                winner=j;
                          }

                          else if(Candidate[i]>Candidate[j])
                          {
                                badlooser=j;
                          }
                }
            }
            System.out.println("\nWinner is Candidate "+winner+" recieved "+Candidate[winner]+" votes.");
			System.out.println("Candidate "+badlooser+" recieved the lowest votes that is "+Candidate[badlooser]);
			System.out.println("Spoilt Ballot are : "+SpoiltBallot);
        }
        catch(Exception e)
        {}
    }
}
