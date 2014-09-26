package day0925.array;

public class MidianOfTwoSortedArrays {

	 public double findMedianSortedArrays(int A[], int B[]) {
	        int lenA = A.length;
	        int lenB = B.length;
	        int indexA = 0;
	        int indexB = 0;
	        int indexC = 0;
	        double C[] = new double[lenA+lenB];
	        double result = -1;
	        while(indexA<lenA&&indexB<lenB){
	        	if(A[indexA]<B[indexB]){
	        		C[indexC] = A[indexA];
	        		indexA++;
	        		indexC++;
	        	}else{
	        		C[indexC] = B[indexB];
	        		indexB++;
	        		indexC++;
	        	}
	        }
	        while(indexA<lenA){
	        	C[indexC] = A[indexA];
	    		indexA++;
	    		indexC++;
	        }
	        while(indexB<lenB){
	        	C[indexC] = B[indexB];
	    		indexB++;
	    		indexC++;
	        }
	        if((lenA+lenB)==1)
	        	return C[0];
	        else if((lenA+lenB)%2==0){
	        	result = (C[(lenA+lenB)/2-1]+C[(lenA+lenB)/2])/2; 
	        }else{
	        	result = C[(lenA+lenB)/2];
	        }
	        return result;
	    }
}
