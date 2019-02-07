

public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }
    
   public static String getRange(int start, int stop, int step) {
        String answer = "";

        for (int i = start; i < stop; i += step){
            answer = answer + i;
        }

        return answer;
    }

    public static String getEvenNumbers(int start, int stop) {
        
        return (start % 2 == 1) ? getRange(start + 1, stop, 2) : getRange(start, stop, 2);
            
    }

    public static String getOddNumbers(int start, int stop) {
        
        return (start % 2 == 0) ? getRange(start + 1, stop, 2): getRange(start, stop, 2);
        
        }
   

    public static String getExponentiations(int start, int stop, int exponent) {
        String answer = "";

        for (int i = start; i < stop + 1; i++){
            double d = Math.pow(i, exponent);
            answer = answer + (int)d;
        }

        return answer;
    }
}
