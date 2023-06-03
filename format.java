

class format{
  float a = 2.24f;
  float b = 1.344667f;
    
    public static void printInFormat(float a, float b){
        float result = a/b;
        
        
        // Your code here to print upto 3 decimal places
        System.out.print(result + " ");
        
        System.out.format( "%.3f",  result);
    }    
    
}



