import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10, 12};
        int target = 2;
    
        int result = BinarySearch2(data, target);
        System.out.println("* " + result);
    }

    public static int BinarySearch2(int arr[], int target) {
        int begin = 0;
        int end = arr.length - 1;
        int mid = arr.length / 2;

        int result = arr[mid];

        while(begin <= end) {  
            if(result == target) {
                return mid;
            } else if(result < target) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (begin + end) / 2;     
            result = arr[mid];
        }

        return -1;
    
    }

}
