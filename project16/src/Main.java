public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 4, 7};
        int[] arr2 = {2, 3, 5, 8};
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) merged[k++] = arr1[i++];
        while (j < arr2.length) merged[k++] = arr2[j++];
        System.out.print("合并后的数组为：");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
