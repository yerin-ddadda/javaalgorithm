package practice;

public class AverageFinder {
    double computeAverage(int[] intArray) {
        // 코드를 입력하세요.
        int sum_num = 0;
        for (int i=0;i<intArray.length;i++){
            sum_num+=intArray[i];
        }
        int a = intArray.length;
        double answer = sum_num / (double)a;
        return answer;
    }
}