import java.util.HashMap;
import java.util.Map;


public class FrogRiverOne {

	public static void main(String[] args) {
		int[] A = {1,3,1,4,2,3,5,4};
		//int[] A = {1,1,1,1,1};//find a solution for the leaves in the same place
		System.out.println(solution(5, A));
	}
	
	public static int solution(int X, int[] A){
		int j = 0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i = 1; i <= X; i++) {
			map.put(i, i);
		}
		
		if(A.length == 1)
			return -1;
		
		for (j = 0;j < A.length; j++) {
			if(map.size() != 0){
				if(map.containsKey(A[j]))
					map.remove(A[j]);
			}
			else if( map.size() == 0 && j != A.length){
				return -1;
			}
			else {
				break;
				
			}
		}
		return j-1;
	}

}
