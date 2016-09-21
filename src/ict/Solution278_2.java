package ict;

/**
 * Created by lon on 16-2-17.
 */
public class Solution278_2 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3,3, 3, 3, 3, 4};
        int len = array.length;
        System.out.println("len" + len);
        binary_search(0, len - 1, 3, array, -1, -1);
    }

    // find the minPos in  the leftArray
    public static int findLeft(int start, int end, int goal, int array[],int leftPos) {
        System.out.println("come in left");
        int low = start;
        int high = end;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == goal) {
                leftPos=mid;
                int ret = findLeft(low, mid - 1, goal, array,leftPos);
                return ret!=-1?ret:leftPos;
            }
            else {
                int ret =findLeft(mid + 1, high, goal, array,leftPos);
                return ret!=-1?ret:leftPos;
            }
        }
        return -1;
    }

    public static int findRight(int start, int end, int goal, int array[],int rightPos) {
        int low = start;
        int high = end;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == goal) {
                rightPos=mid;
                int ret =findRight(mid + 1, high, goal, array,rightPos);
                return ret!=-1?ret:rightPos;
            }
            else {
                int ret = findRight(low, mid - 1, goal, array,rightPos);
                return ret!=-1?ret:rightPos;
            }
        }
        return -1;
    }


    public static void binary_search(int start, int end, int goal, int array[], int minPos, int maxPos) {
        int low = start;
        int high = end;
        int mid ;
        int left =-1;
        int right =-1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == goal) {
                left=findLeft(low, mid - 1, goal, array,mid);
                right=findRight(mid + 1, high, goal, array,mid);
                break;
            } else if (array[mid] < goal) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        System.out.println("left"+left);
        System.out.println("right"+right);
    }
}
