class method3
{
public static void main(String[] ar)
{
System.out.println(getAge());    /* without argument with return statement */

System.out.println(sum());	
}

public static int getAge()
{
int age=26;
return age;
}

public static int sum()
{
int s=0;
for(int i=10;i<=70;i++)
{
if(i%2==1)
{
s=s+i;
}
}return s;
}

}