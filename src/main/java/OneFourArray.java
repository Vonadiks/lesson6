public class OneFourArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5};
        int[] arr2 = {1, 4, 4, 1};
        int[] arr3 = {1, 4, 4, 4, 4};
        int[] arr4 = {2, 3, 5};
        System.out.println(doOneFourArray(arr1));
        System.out.println(doOneFourArray(arr2));
        System.out.println(doOneFourArray(arr3));
        System.out.println(doOneFourArray(arr4));
    }

    public static boolean doOneFourArray(int[] arr) {
        boolean b = true;
        int countOne = 0;
        int countFour = 0;
        int i = 0;
        while ((i < arr.length) && (b == true)) {
            switch (arr[i]) {
                case (1) :
                    countOne++;
                    b = true;
                    break;
                case (4) :
                    countFour++;
                    b = true;
                    break;
                default :
                    b = false;
                    break;
            }
            i++;
        }
        if ( (b == true) && (countOne > 0) && (countFour > 0))
            return true;
        else return false;
    }
}
