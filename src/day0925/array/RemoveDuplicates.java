package day0925.array;

public class RemoveDuplicates {

	public int removeDuplicates(int[] A) {
		int len = A.length;
		int index = 1;
		if(len<=1){
			return len;
		}else{
			for (int i = 1; i < len; i++) {
				if(A[i]!=A[i-1]){
					 A[index] = A[i];
					 index++;
				}
			}
		}
		return index;
	}
}
