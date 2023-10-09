import java.util.ArrayList;
import java.util.Scanner;

public class listaverage {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("enter values");
        String str = value.nextLine();
        double average = Average(str);
        System.out.println(average);
    }
    public static double Average(String str) {
        String[] val = str.split(" ");
        ArrayList<Integer> numList = new ArrayList<>();

        for (String number : val) {

            int value = Integer.parseInt(number);
            numList.add(value);

        }

        int total = 0;
        for (int num : numList) {
            total += num;
        }


        return total / numList.size();

    }
}
