package array2d;

import java.util.Arrays;

public class arraycalss {

	public static void main(String[] args) {
		
		int [] arrA = {3, 4, 2, 12, 3, 1};
		
        int size = arrA.length;
        if(size==0)
            return;

        System.out.println("Original Array: " + Arrays.toString(arrA));

        //initialize last element in array as maximum element seen so far
        int max_so_far = arrA[size-1];

        //traverse the array from right to left
        //if visited element is smaller than max_so_far, replace element by max_so_far
        //if visited element is equal to max_so_far, replace element by 0
        //if visited element is greater than max_so_far, do max_so_far = element and element = 0
        for (int i = size-1; i >=0 ; i--) {
            if(max_so_far==arrA[i])
                arrA[i]=0;
            else if(max_so_far>arrA[i])
                arrA[i]=max_so_far;
            else if(max_so_far<arrA[i]){
                max_so_far = arrA[i];
                //arrA[i] = 0;
            }
        }
        System.out.println("Modified Array: " + Arrays.toString(arrA));
    }


        

    

}
