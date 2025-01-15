public class RecursiveFunctions {
    public static void main(String[] args) {

    }

    public static boolean sumExist(int[] a, int sum) {
        return sumExist(a, 0, a.length-1, sum);
    }

    private static boolean sumExist(int[] a, int first, int last, int sum) {
        if(first >= last) {
            return false;
        }

        int s = a[first] + a[last];
        if(s == sum) {
            return true;
        } else {
            if(s < sum) {
                return sumExist(a, first + 1, last, sum);
            } else {
                return sumExist(a, first, last - 1, sum);
            }
        }

    }


}
