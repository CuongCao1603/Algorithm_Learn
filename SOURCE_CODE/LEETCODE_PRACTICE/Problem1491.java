package LEETCODE_PRACTICE;

public class Problem1491 {
    public static double average(int[] salary) {
        double result = 0;
        int min = salary[0];
        int max = salary[0];

        for (int i = 0; i < salary.length; i++) {
            if(salary[i] > max){
                max = salary[i];
            }

            if(salary[i] < min){
                min = salary[i];
            }

            result += salary[i];
        }
        result = result - min - max;
        return  result / (salary.length - 2);
    }

    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};

        double result =  average(salary);
        System.out.println("Result: " + result);
    }
}
