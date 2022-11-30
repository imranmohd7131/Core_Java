class For
{
public static void main(String[] ar)
{
for(int i=1;i<=5;i++)
{
System.out.println("java");
}

System.out.println("\n");

for(int i=1;i<=10;i++)
{
System.out.println(i);
}

System.out.println("\n");

for(int i=1;i<=10;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}

System.out.println("\n");

for(int i=1;i<=100;i++)
{
if(i%2==1)
{
System.out.println(i);
}
}

System.out.println("\n");

for(int i=10;i>=1;i--)
{
System.out.println(i);
}

System.out.println("\n");

int count=0;
for(int i=1;i<=100;i++)
{
if(i%2==1)
{
count++;
}
}
System.out.println(count);

}
}