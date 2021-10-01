/*Hands of the Clock
In the dial of an analog clock, tweleve alternate letters of the English alphabet are written to indicate 1 to 12.
Input Format
Captial letters are written and it may start from any letter A to D. Given the letter from which numbering starts, a hour of a time, a minute of a time,
write a program to find out the position of hour hand and minute hand. 
For Example, if the numbering starts from 'D' and the hour of the given time is 19 and minute of the given time is 45 then the hour hand will be 'Between P and R' and
minitue hand will be 'On T'. if the time is 07:00 then the hour hand will be 'On P' and minute hand will be 'On Z'.
Only valid time will be given as input, hour will be given from 0 to 24 and minitue will be from 0 to 59.

First line contains the letter from which the numbering starts

Next line contains the hour of the time

Next line contains minute of the time

Output Format

In the first line, print the position of hour hand – Print On a particular letter or Between two letters

In the next line, print the position of minute hand
*/
import java.util.*;
public class Hands_of_the_Clock
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
int time[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
String str[] = new String[20];
String alp[] = {"","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
String let = in.nextLine();
int pos = 0, i, j, k = 1;
int htime = in.nextInt(); 
int mtime = in.nextInt();
if(htime >= 12)                      
htime = htime - 12; 

for(i=1;i<=26;i++)
if(let.equals(alp[i]) == true)
pos=i;                              

for(i = pos ; i <= 26 ; i += 2)
{ str[k] = alp[i];
k++;
}

if(mtime == 0 && htime != 0)
System.out.print("On "+str[htime]+"\nOn "+str[12]);
 if(mtime == 0 && htime == 0)
System.out.print("On "+str[12]+"\nOn "+str[12]);
if(mtime > 0)
{
if(htime != 0)
System.out.print("Between "+str[htime]+" and "+str[htime+1]);
if(htime == 0)
System.out.print("Between "+str[12]+" and "+str[htime+1]);

if(mtime%5 == 0)
System.out.print("\nOn "+str[mtime/5]);
else 
{
if(mtime > 5)
System.out.print("\nBetween "+str[(mtime/5)]+" and "+str[(mtime/5)+1]);
else
System.out.print("\nBetween "+str[(12)]+" and "+str[1]);
}    
}
}
}