import java.util.Arrays;
public class StatsCalculator {
    private double [] original;
    double [] values;
    private double max;
    private double min;
    private double median;
    private double firstQuartile;
    private double secondQuartile;
    int length;
   //default constructor, sets all values to zero
     public StatsCalculator(){
        values = new double[20];
        length = values.length;
       
    }
    
    //constructor that assigns values the values of the input array
    StatsCalculator(double [] values){
        this.values = values;
        length = values.length;
        original = values;
    }
    //sorts the values into ascending order
    public void sortData(){
      Arrays.sort(values);
    }
    //finds the maximum
    public double calculateMax(){
       double greatest = values[0];
       for (int i=0; i<length; i++){ 
            if (values[i] > greatest){
                greatest = values[i];
            }  
        }
        max=greatest;
        return greatest;
    }
    
    //returns the sum
    public double calculateSum(){
       double sum = 0;
       for (int i = 0; i <= length; i++ ){ 
            sum += values[i];  
        }
        return sum;
    }
    
    //finds the median
    public double calculateMedian(){
       this.sortData();
       double median = 0; 
       
       //if the number is divisible by 2 then our array is of an even length
       if( ((int) this.length % 2) > 0) {// example 1,4,5,6. Median is 4 + 5 / 2
           median = ((values[this.length/2]) + (this.values[this.length/2]+1)) / 2;
       }
       else {
           median = values[this.length / 2];
       }
       
       return(median);
    }
    
    //finds the mean
    public double calculateMean(){
       return(this.calculateSum() / this.length);
    }
    
    // calculates the 1st quartile
    // 1,5,2,1,3,4 -> 5 
    public double calculateFirstQuartile(){
        this.sortData();
        
        //find the halfway point
        int halfwayPoint = length/2;
        //find the median of the first half of the array
           //create an array that is the first half of the values array
           double[] halfValues = new double[halfwayPoint];
           for (int i=0;i<halfwayPoint;i++){
               halfValues[i]=values[i];
           }
           //find median of halfValues
           if( ((int) halfValues.length % 2) > 0) {// example 1,4,5,6. Median is 4 + 5 / 2
           firstQuartile = ((halfValues[halfValues.length/2]) + (halfValues[halfValues.length/2]+1)) / 2;
       }
       else {
           firstQuartile = halfValues[halfValues.length / 2];
       }
       
       return(firstQuartile);
    }
       
   
   
   public double calculateSecondQuartile(){
       this.sortData();
       //find the halfway point
        int halfwayPoint = length/2;
        //find the median of the second half of the array
           //create an array that is the second half of the values array
           double[] secondHalfVals = new double[halfwayPoint];
           int x = 0;//starting point of secondHalfVals
           for(int i = values.length-1; i>halfwayPoint;i--){
               secondHalfVals[x]=values[i];
               x++;
           }
           //find median of secondHalfVals
           if( (((int) secondHalfVals.length) % 2) > 0) {// example 1,4,5,6. Median is 4 + 5 / 2
           secondQuartile = ((secondHalfVals[secondHalfVals.length/2]) + (secondHalfVals[secondHalfVals.length/2]+1)) / 2;
       }
       else {
           secondQuartile = secondHalfVals[secondHalfVals.length / 2];
       }
       
       return(secondQuartile);
           
       
   }
   
   
  
    
    
    //finds the minimum
    public double calculateMin(){
       double minimum = values[0];
       for (int i=0;i<=length;i++){ 
         if (values[i]<minimum){
             minimum = values[i];
            }  
        
         }
    min=minimum;
    return minimum;
    }
    
    
}
