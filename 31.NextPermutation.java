class Solution {
    public void nextPermutation(int[] a) {
        int len = a.length;
        int i, j;
        for (i = len - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                break;
            }
        }
        if (i >= 0) {
            for (j = len - 1; j > i; j--) {
                if (a[j] > a[i]) {
                    break;
                }
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        reverse(a, i + 1, len - 1);
    }
    private void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}
