import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ex2 {
    public static final int MAX = 5;
    public static void main(String[] args) {
            System.out.println("Welcome to the Application!");

            List<Integer> nums = new ArrayList<>();
            input(nums);

            Sorting(nums);
            Print(nums);
        }

        public static void input(List<Integer> nums){

            Scanner inp = new Scanner(System.in);

            System.out.println("Enter 5 valid integers in the range [0, 10]");

            while(nums.size() < MAX) {

                String s = inp.nextLine();


                int num = Integer.parseInt(s);

                if(checkRange(num)) {
                    System.out.println("Invalid range! Try again!");
                    continue;
                }
                nums.add(num);
            }
            inp.close();

        }

        public static void CheckType(String s){
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid! Try again!");
            }
        }


        public static boolean checkRange(int num){
           return  num<0 || num > 10;
        }

        public static void Sorting(List<Integer> nums){
            Collections.sort(nums);
        }

        public static void Print(List<Integer> nums){
            for(int num : nums) {
                System.out.print(num+" ");
            }
        }
}