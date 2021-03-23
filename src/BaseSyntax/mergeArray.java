package BaseSyntax;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class mergeArray {

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int [] result = new int[a1.length + a2.length];
        int pos1 = 0;
        int pos2 = 0;
        while(pos1<a1.length || pos2<a2.length) {
            result[pos1+pos2] = (pos1<a1.length && (pos2 == a2.length || a1[pos1]<a2[pos2]) ?
                    a1[pos1++] : a2[pos2++]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 5, 10}, new int[]{4, 12, 13})));
    }

}
