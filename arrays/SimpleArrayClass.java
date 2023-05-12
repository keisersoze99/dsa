package arrays;

/**
 * SimpleArrayClass
 */
public class SimpleArrayClass {

    public static void main(String[] args) {
        System.out.println("Hello Everyone");
    }

    public static int linearSearch(int arr[], int numberToSearch) {
        int index = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == numberToSearch) {
                index = i;
                break;
            }
        }
        return index;
    }
}
