
public class Main {
    public static int[] evenCount(int array[]){
        int evenCountArray[] = new int[array.length];
        evenCountArray[0] = (array[0] % 2 == 0) ? 1 : 0;
        for (int iterator = 1; iterator < array.length ;iterator++){
            evenCountArray[iterator] += (array[iterator] % 2 ==0) ? evenCountArray[iterator-1]+1 : evenCountArray[iterator-1];
        }
        return evenCountArray;
    }

    public static void main(String[] args) {
        int array[] = {2,1,8,3,9,6};
        int arrayOfRange[][]={{0,3}, {3,5}, {1,3}, {2,4}};
        int evenCountOfArray[] = evenCount(array);
        int iterator = 0 ;
        while (iterator < arrayOfRange.length){
            int left = arrayOfRange[iterator][0];
            int right = arrayOfRange[iterator][1];
            if (left == 0){
                System.out.print(evenCountOfArray[right] + " ");
            }else {
                System.out.print(evenCountOfArray[right] - evenCountOfArray[left - 1] + " ");
            }
            iterator++;
        }
    }
}