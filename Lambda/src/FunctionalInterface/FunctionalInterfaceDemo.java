package FunctionalInterface;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
	public static int getSum(int[] arr,Predicate<Integer> condition) {
		int sum=0;
		for(int num:arr) {
			if(condition.test(num)) {
				sum+=num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5,6};
		int evenSum = getSum(intArr,x->x%2==0);
		System.out.println("Sum of even numbers:"+evenSum);
		System.out.println("Sum of odd numbers:"+ getSum(intArr,x->x%2!=0));

	}

}
