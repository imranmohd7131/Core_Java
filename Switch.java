class Switch
{
  public static void main(String[] ar)
  {
    char c='e';
    switch(c)
    {
      case 'a': System.out.println("aa");
                break;
      case 'b': System.out.println("bb");
                break;
      case 'c': System.out.println("cc");
                break;
      case 'd': System.out.println("dd");
                break;
      default : System.out.println("other");
    }
  
    int a=19;
    int b=14;
    switch(a-b)
    {
      case 2: System.out.println("two");
                break;  
      case 4: System.out.println("four");
                break;
      case 3: System.out.println("three");
                break;
      case 5: System.out.println("five");
                break;
      default : System.out.println("other");  
    }
  }
}