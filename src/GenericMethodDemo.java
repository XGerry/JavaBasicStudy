public class GenericMethodDemo {
    public static void main(String[] args) {
        String[] strArray = {"11", "22", "33"};
        Integer[] intArray = {1, 2, 3};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        System.out.println("\n字符串数组元素为:");
        printArray(strArray); // 传递一个字符串数组

        System.out.println("\n整型数组元素为:");
        printArray(intArray); // 传递一个整型数组

        System.out.println("\n双精度型数组元素为:");
        printArray(doubleArray); // 传递一个双精度型数组

        System.out.println("\n字符型数组元素为:");
        printArray(charArray); // 传递一个字符型数组

    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray
                ) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
