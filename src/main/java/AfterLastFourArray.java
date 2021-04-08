import java.util.Arrays;

public class AfterLastFourArray {
    public static void main(String[] args) {
        int[] test1 = {4, 1, 2, 3, 2, 4, 4, 2, 1, 0};
        int[] test2 = {2, 1, 2, 3, 2, 7, 7, 2, 1, 0};
        int[] test3 = {1, 4, 2, 4, 3, 4, 4, 4, 5, 0};
        int[] test4 = {2, 4, 2, 3, 2, 7};
        try {
            System.out.println(Arrays.toString(doAfterLastFourArray(test1)));
            System.out.println(Arrays.toString(doAfterLastFourArray(test3)));
            System.out.println(Arrays.toString(doAfterLastFourArray(test4)));
            System.out.println(Arrays.toString(doAfterLastFourArray(test2)));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    public static int[] doAfterLastFourArray(int[] arr) throws RuntimeException {
        int[] res = null;
        int i = arr.length - 1;
        int j = 0;
        boolean isFour = false;
        while ((i >= 0) && (isFour != true)) {
            if (arr[i] == 4) {
                isFour = true;
            }
            j = i;
            i--;
        }
        if (isFour == true) {
            res = new int[arr.length - j - 1];
            for (i = j + 1; i < arr.length ; i++) {
                res[i - j - 1] = arr[i];
            }
        }
        else {
            throw new RuntimeException("В массиве 4ки не найдены");
        }
        return res;
    }
}
