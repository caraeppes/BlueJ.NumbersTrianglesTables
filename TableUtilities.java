 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String answer = "";
        
        for (int i = 1; i < tableSize + 1; i++){
            for (int j = 1; j < tableSize + 1; j++){
                int n = j * i;
                if (n < 10){
                    answer = answer + "  " + n + " |";
                }
                else if (n < 100){
                    answer = answer + " " + n + " |";
                }
                else if (n < 1000){
                    answer = answer + n + " |";
                }
                if (j == tableSize){
                    answer = answer + "\n";
                }
            }
        }
        
        return answer;
    }
}
