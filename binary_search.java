public class binary_search {
    public static int search(int[] arr, int e){
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid] == e){
                return mid;
            } else if (arr[mid] < e){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] array1 = {2,3,4,5,6,7,8,9,10,11,12,13};
        int element = 8;
        int index = search(array1, element);
        if (index == -1){
            System.out.println("element not found in the array");
        } else{
            System.out.println("element found at index position " + index);
        }
    }
    
}
