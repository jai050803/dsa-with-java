public class max_number{
    public static int search(int[] numbers){
        int maxnumber = numbers[0];

        for (int i = 1; i< numbers.length ; i++){
            if (numbers[i] > maxnumber){
                maxnumber = numbers[i];
            }
        }
        return maxnumber;
    }
    public static void main(String[] args) {
        int[] number_list = {4,8,8,2,5,7,9,12};
        int result = search(number_list);
        System.out.println(result);
    }
}