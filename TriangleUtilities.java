 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String answer = "";
        
        for (int i = 0; i < numberOfStars; i++){
            answer = answer + "*";
        }
        
        return answer;
    }
    
    public static String getTriangle(int numberOfRows) {
        String answer = "";
        for(int i = 1; i < numberOfRows + 1; i++){
            answer = answer + getRow(i) + "\n";
        }
        
        return answer;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
