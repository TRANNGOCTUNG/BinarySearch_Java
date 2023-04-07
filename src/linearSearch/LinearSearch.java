package linearSearch;

public class LinearSearch {
    public static int linearSearchs(int[] array, int temp){
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == temp){
                result = i;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "LinearSearch{}";
    }
}
