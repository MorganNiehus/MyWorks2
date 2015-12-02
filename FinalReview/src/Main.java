
public class Main {
	
	public static void main(String[] args){
			
		double volumeVal = volume(5);
		int[] smallestArray = {5,2,6,2,8,9,4,3};
		
		System.out.println(swapString("VALDOSTA"));
		System.out.println(distance(1,-2,5,1));
		System.out.printf("%10.1f" , volume(5));
		System.out.printf("\n%10d" , smallest(smallestArray));
		
		
	}
	public static String swapString(String word){
		
		int mid = word.length() / 2;
		
		String end = word.substring(mid);
		String begin = word.substring(0 , mid);
		
		return end + " " + begin;
		
	}
	
	public static double distance(int x1, int y1, int x2, int y2){
		
		double value = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2 - y1),2));
		return value;
		
	}
	
	public static double volume(int r){
		double value = (double)4/3 * Math.PI * Math.pow(r, 3);
		return value;
	}
	
	public static int smallest(int[] numbers){
		int temp = numbers[0];
		for (int i = 0; i < numbers.length; i++){
			if(numbers[i] < temp){
				temp = numbers[i];
			}
		}
		return temp;
	}
	
	
	
	

}
