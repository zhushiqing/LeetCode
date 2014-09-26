package zju.zsq.solution;

public class TwoSum {
	public int reverse(int x) {
        int sum = 0;
        if(x > 0){
            while( x != 0){
                sum = sum * 10 + x % 10;
                x = x / 10;
            }
        }
        else if( x == 0){
            sum = x;
        }
        else {
            x = -x;
            while( x != 0){
                sum = sum * 10 + x % 10;
                x = x / 10;
            }
            sum = - sum;
        }
        return sum;
        }
}
