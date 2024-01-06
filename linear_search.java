<<<<<<< HEAD
public class linear_search {
    public static int linear(int[] numbers, int e){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == e){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array1 = {5,6,12,19,29,45,23,34};
        int element = 8;
        int index = linear(array1,element);
        if (index != -1){
            System.out.println("element found at the position " + index);
        } else {
            System.out.println("element not found in the array");
        }
    }
}
=======

>>>>>>> 752854b6d746afef413d5fd87bdd52fabc79839b
