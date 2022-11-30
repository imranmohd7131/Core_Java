class string //for(int i=0;i<=str.length()-1;i++){}
{



public static void main(String[] args)
{
String st="Hello World";
for(int i=0;i<=st.length()-1;i++)
{
System.out.println(st.charAt(i));
}
System.out.println("\n");

String str="imrann";
if(str.length()%2==0)
{
for(int i=0;i<=str.length()-1;i++)
{
System.out.println(str.charAt(i));
}
}
else
{
for(int i=str.length()-1;i>=0;i--)
{
System.out.println(str.charAt(i));
}
}

}
}