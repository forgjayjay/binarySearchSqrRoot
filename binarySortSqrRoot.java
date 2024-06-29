import java.util.Scanner;

public class binarySortSqrRoot {
    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number to find root: ");
        int target = sc.nextInt();
        System.out.println("------------------------------------------------------");
        binarySortSqrRoot sort = new binarySortSqrRoot();
        int result = sort.recBinarySearch(target, 1, target);
        System.out.println("------------------------------------------------------");
        sc.close();
        System.out.println(((result != 0) ? ("Result: " + result) : "Root for this number doesn't exist"));
    }

    public int recBinarySearch(int target, int floor, int roof){


        int val = floor + (roof - floor) / 2;
        int currSquare = (int)Math.pow(val,2);

        if(roof - floor == 1) return 0;

        if(currSquare == target){
            return val;
        } else if (currSquare < target){
            return recBinarySearch(target, val, roof);
        }

        return recBinarySearch(target, floor, val);
    }
}
