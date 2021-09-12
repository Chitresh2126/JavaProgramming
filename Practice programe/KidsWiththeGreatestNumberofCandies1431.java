import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class KidsWiththeGreatestNumberofCandies1431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] candies = new int[5];
        for (int i = 0 ; i<5 ; i++){
            candies[i] = scanner.nextInt();
        }
        int extracandies = scanner.nextInt();

        List<Boolean> ans = kidsWithCandies(candies,extracandies);
        System.out.println(Arrays.toString(new List[]{ans}));

    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0; // Intially max candies are 0
        for (int candy : candies) { // Run the loop to find which kid has max candies,
            maxCandies = Math.max(candy, maxCandies);
        }

        List<Boolean> result = new ArrayList<>();

        for(int i = 0; i < candies.length; i++){ // Run the loop to add extraCandies in all kids candies and check if they are getting more then
            result.add(candies[i] + extraCandies >= maxCandies); // the maxCandies we get upside
        }

        return result; // Finally return
    }
    //    private static boolean noman(int[] candies, int extracandies) {
//        int max_candies = 0;
//        for (int t=0 ; t<5 ; t++){
//            max_candies = Math.max(candies[t],max_candies);
//        }
//        for (int j = 0; j<5 ;j++){
//            if ((candies[j]+extracandies)<max_candies){
//                return true;
//            }
//
//        }
//        return false;
//    }
}


