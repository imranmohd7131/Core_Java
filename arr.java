class arr
{
public static void main(String[] st)
{

int[] rolls={1,2,3,4,5};
System.out.println(rolls[2]);
System.out.println(rolls.length);
rolls[2]=4;
System.out.println(rolls[2]);
System.out.println("\n");

String[] name={"imran","ajay","deepak"};
System.out.println(name[2]);
System.out.println("\n");

char[] grades={'a','b','c','d','e','f','g'};
for(int i=grades.length-1;i>=0;i--)
{
System.out.println(grades[i]);
}
System.out.println("\n");

int[] num={1,2,30,4,5,6,7,8,9};
for(int i=0;i<=num.length-1;i++)
{
if(num[i]%2==0)
{
System.out.println(num[i]);
}
}
System.out.println("\n");

int s=0;
int s2=0;
int[] n={1,2,3,4,5,6,7,8,9};
for(int i=0;i<=n.length-1;i++)
{
if(n[i]%2==0)
{
s=s+n[i];
}
}
for(int i=0;i<=n.length-1;i++)
{
if(n[i]%2!=0)
{
s2=s2+n[i];
}
}

if(s>s2)
{
System.out.println(s);
}
else
{
System.out.println(s2);
}


}
}