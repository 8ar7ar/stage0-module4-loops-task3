package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int series = 9;
        for (int i = 1; i <= lengthOfLastNumber; i++){
            sum += series;
            series = (series * 10) + 9;
        }
        System.out.println(sum);
    }
}
