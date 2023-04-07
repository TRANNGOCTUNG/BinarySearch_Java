package linearSearch;

import java.util.Scanner;

public class TestLinear {
    public static void main(String[] args) {
        LinearSearch linear = new LinearSearch();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Nhập temp");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        System.out.println(LinearSearch.linearSearchs(array,temp));
    }
}
