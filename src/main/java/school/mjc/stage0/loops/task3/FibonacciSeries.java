package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0;
        int num2 = 1;
        int count = 1;
        while (count <= lastFibonacci) {
            System.out.println(num1);
            int temp = num2; //1
            num2 += num1;  //1 + 0 =1
            num1 = temp;
            count++;
        }
    }
}
