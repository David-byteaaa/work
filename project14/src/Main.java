public class Main {
    public static <T extends Comparable<T>> T getMax(T[] array) {
        T max = array[0]; // 假设第一个元素最大
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] intArray = {3, 7, 2, 9, 5};
        System.out.println("整型数组最大值：" + getMax(intArray));
        Double[] doubleArray = {2.5, 3.7, 1.2, 9.8};
        System.out.println("浮点数组最大值：" + getMax(doubleArray));
        String[] strArray = {"apple", "banana", "pear", "orange"};
        System.out.println("字符串数组最大值：" + getMax(strArray));
    }
}
