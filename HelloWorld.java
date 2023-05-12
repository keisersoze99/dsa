public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
  	}

	public static int linearSearch(int arr[], int numberToSearch) {
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == numberToSearch) {
				index = i;
				break;
			}
		}
		return index;
	}
}
