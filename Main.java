class Main {
  public static void main(String[] args) {
    int a = 5;
    for(int i = 1; i<=a; i++)
      {
        for(int j = 0; j<a-i;j++)
          System.out.print(" ");
        for(int j = 0;j<(i); j++) System.out.print("*");
        System.out.println(" ");
        
      }
  }
}