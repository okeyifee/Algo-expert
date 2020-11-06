import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfTwoArrayNumbers{
    public static void main(String[] args) {
        int[] sammy = new int[]{-4,1,11,8,6,3,5,-1};

        checkSum(sammy, 10);
    }

    public static List<Integer> checkSum(int[] num, int sum){

        List<Integer> arr = new ArrayList<Integer>();
        Collections.sort(arr);
        int total = sum;



        for (int i = 0; i < num.length; i++) {
            int x = num[i];
            int hold = num.length - 1;
            int y = num[hold];

            int check = x + y;


            if (check > total){
                hold--;
                y = num[hold];
                x = num[i];
            }

            if (check < total){
//                y = num[hold];
//                x = num[i];
                continue;
            }

            if (check == total){
                arr.add(x);
                arr.add(y);
                return arr;
            }
        }

        return arr;
    }
}
