package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        int number = t;
        if (number < 0) number *= -1;
        while (number > 0){
            sum += number%10;
            number /= 10;
        }
        System.out.println(sum);

    }
}
