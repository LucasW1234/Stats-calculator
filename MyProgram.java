import java.util.Arrays;
public class MyProgram
{
    public static void main(String[] args)
    {
      double [] test = {1.0,2.3,8.4,12,14,15,11,6.8,2,17.5,4,5,8,9,10,15,9.3,23,3.4,7,5};
      StatsCalculator bob = new StatsCalculator(test);  
      
    bob.sortData();
  
  
    for (int i=0;i<=20;i++){
        System.out.print (bob.values[i]+", ");
    }
    System.out.println();
        System.out.println(bob.calculateMax());
        System.out.println(bob.calculateMedian());
        System.out.println(bob.calculateFirstQuartile());
        System.out.println(bob.calculateSecondQuartile());
        
    }
}
