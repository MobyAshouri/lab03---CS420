package lab03;
public class lab03 {
    public static String simpleAlgorithm(int i, int j) {
        int firstValue = i;         // this is here just for correct output
        int secondValue = j;        // same as above, but not as necessary

        // NOTE: in a real world scenario, only allow for i and j to be positive ints

        int prevAccumulator = 0;
        int accumulator = 0;
        int largestCycle = 0;

        for (int outerValue = i; outerValue <= j; outerValue++){
            prevAccumulator = accumulator;
            i = outerValue;

            while (i!=j+1) {
        
                if (i % 2 == 0) {
                    i/=2;
                } else if (i==1) {
                    accumulator+=1;
                    break;
                } else if (i % 2 == 1){
                    i = i * 3 + 1;
                }
    
                accumulator+=1;
            }

            if (largestCycle > accumulator - prevAccumulator){} else {largestCycle = accumulator-prevAccumulator;}
        }

        return String.valueOf(firstValue) + " " + String.valueOf(secondValue) + " " + String.valueOf(largestCycle);
    }
}
