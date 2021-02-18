import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] n1 = {3,4,66,-2};
		int[] n3 = new int[5]; // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];
        
        
        System.arraycopy(n1,  0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));
        
        System.arraycopy(n3,  0, n2, 0, n1.length);
        System.out.println();

	}

}
