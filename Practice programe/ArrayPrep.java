import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] N = new int[5];

//        for (int i = 0; i < N.length; i++){
//            N[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < N.length; i++){
//            System.out.println(N[i]);
//        for (int num: N){
//            System.out.print(num +  " ");
//        }



//        System.out.println(Arrays.toString(N));

//        String[] N = new String[5];
//
//        for (int i = 0; i < N.length; i++){
//            N[i] = scanner.next();
//        }
//        System.out.println(Arrays.toString(N));
//        N[1] = "Reo";
//        System.out.println(Arrays.toString(N));

//        int[] nums = {1, 3, 4, 5 ,7};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));
//        int[][] arr = new int[3][];
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}};
//        int[][] arr = new int[3][2];
//        int[][] arr = new int[3][3];
//        System.out.println(arr.length);//no. of rows
//
//            //input
//        for (int row = 0; row < arr.length; row++){
//            //for col
//            for (int col = 0; col < arr[row].length ; col++){
//                arr[row][col] = scanner.nextInt();
//            }
//        }
        //output
//        for (int row = 0; row < arr.length; row++){
//            //for col
//            for (int col = 0; col < arr[row].length ; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        //output
//        for (int row = 0; row < arr.length; row++){
//            //for col
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //output
//        for (int[] a: arr){
//            System.out.println(Arrays.toString(a));
//        }
//        int[][] arr = {
//               {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}};
//        for (int row = 0; row < arr.length; row++){
//            //for col
//            for (int col = 0; col < arr[row].length ; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(234);
//        list.add(235);
//        list.add(236);
//        list.add(237);
//        list.add(238);
//        list.add(234);
//        list.add(235);
//        list.add(236);
//        list.add(237);
//        list.add(238);
//        list.add(234);
//        list.add(235);
//        list.add(236);
//        list.add(237);
//        list.add(238);
//        System.out.print(list + " ");
//        System.out.println(list.contains(234));
//        list.set(1 , 9999);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
        //input
//        for (int i = 0; i < 5; i++){
//            list.add(scanner.nextInt());
//        }
//
//        for (int i = 0; i < 5; i++){
//            System.out.print(list.get(i) + " ");//pass index here ,list[index] syntax will not work here
//        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
//        for (int i = 0; i < 3; i++){
//            list.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                list.get(i).add(scanner.nextInt());
//            }
//        }
//        System.out.println(list);
        //Swapping the array
//        int[] ints = {1, 2, 3, 4, 5};
//        swap(ints , 1, 3);
//        System.out.println(Arrays.toString(ints));

        int[] nu = {1, 2, 3, 4, 5};
//        System.out.println(max(nu));
//        System.out.println(maxRange(nu ,1,3));
        System.out.println(Math.min(1 , 2 ));
    }

//    private static int maxRange(int[] nu, int i, int i1) {
//        int value = i;
//        for (int j =1 ; j < i1 ; j++){
//            if ( nu[j] > value){
//                value = nu[j];
//    }


//    static int max(int[] nu) {
//
////        int value = Integer.MIN_VALUE;
//        int value = nu[0];
//        for (int i =1 ; i < nu.length ; i++){
//            if ( nu[i] > value){
//                value = nu[i];
//            }
//        }
//        return value;
    }
//    static void reserved(int[] arr){
//    int start = 0;
//    int end = arr.length -1 ;
//    while (start < end){
//        swap(arr , start , end);
//        start++;
//        end--;
//    }
//    }

//    static void swap(int[] ints, int j, int i1) {
//        int temp = ints[j];
//        ints[j] = ints[i1];
//        ints[i1] = temp;
//
//    }

//    static void change(int[] arr){
//        arr[0] = 99;
//
//    }

