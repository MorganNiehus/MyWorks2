import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
	
	

	public static void main(String[] args){
			
		double volumeVal = volume(5);
		int[] smallestArray = {1,2,3,4,5,6,7,8,9};
		int[] populateArray = new int[5];
		
		double[][] largestArray = {{4.2, 2.9, 3.6} , {4.6, 5.2, 2.6}};
		double[] randomArray = {3.5, 7.2, 8.2, 9.7};
		int[][] rowTotals = {{10,5,20,30},
		                     {30,5},		    
		                     {4,6,1}}; 
		
		
		System.out.println(swapString("VALDOSTA"));
		System.out.println(distance(1,-2,5,1));
		System.out.printf("%10.1f" , volume(5));
		System.out.printf("\n%10d" , smallest(smallestArray));
		System.out.printf("\n%10s" , computerGrade(90));
		rotateLeft(smallestArray);
		System.out.println();
		for(int i = 0; i < smallestArray.length; i++){
			System.out.print(smallestArray[i] + " ");
		}
		System.out.println("\n" + getList(4,7));
		System.out.print("\n" + getListArraySum(5,8));
		System.out.println("\n" + max(largestArray));
		System.out.println("\n" + getRandomValue(randomArray));
		printTable(-20);
		System.out.println();
		computeRowTotals(rowTotals);
		System.out.println();
		printPattern(5);
		countEven(5,10);
		System.out.println(countLetters("cool"));
		int[] returnedArray = expand(populateArray);
		System.out.println();
		

		
		
		
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
	
	public static char computerGrade(int score){
		char grade;
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		return grade;
		
	}
	public static void rotateLeft(int[] numbers){
		int temp = numbers[0];
		for(int i = 0; i < numbers.length - 1; i++){
			numbers [i] = numbers[i + 1];
		}
		numbers[numbers.length - 1] = temp;
	}
	
	public static ArrayList<Integer> getList(int low, int high){
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		int index = high;
		for(int i = low; i < high + 1; i++){
			numbers.add(i);
		}
		return numbers;
	}
	
	public static int getListArraySum(int low, int high){
		
		int sum = 0;
		int[] numbers = new int[high - low + 1];
				
		for(int i = low; i < high + 1; i++){
			numbers[i - low] = i;
			sum += i;
		}
		
		return sum;
	}
	
	public static double max(double[][] numbers){
		
		double max = numbers[0][0];
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers[i].length; j++){
				if(numbers[i][j] > max)
					max = numbers[i][j];
			}
		}
		
		return max;
	}
	
	public static double getRandomValue(double[] numbers){
		
		Random rng = new Random();
		
		return numbers[rng.nextInt(numbers.length)];
		
	}
	
	public static void printTable(int x){
		
		for(int i = 0; i < 5; i++){
			System.out.println((x) + "\t" + (x-3) + "\t" + (x+3));
			x += 10;
		}
		
	}
	
	public static void computeRowTotals(int[][] numbers){
		
		for(int i = 0; i < numbers.length; i++){
			int sum = 0;
			for(int j = 0; j < numbers[i].length; j++){
				sum += numbers[i][j];
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.print(sum + "\n");
		}
		
		
	}
	
	public static void printPattern(int x){
		for(int i = 1, r = x; i <= x; i++, r++){
			for(int j = 1; j <= i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void countEven(int low, int high){
		int sum = 0;
		for(int i = low; i <= high; i++){
			if(i%2 == 0)
				sum += i;
		}
		System.out.println(sum);
	}
	
	public static int countLetters(String word){
		return word.toUpperCase().length();
	}
	
	public static int[] expand(int[] list){
		
		int[] newList = new int [list.length*2];
		for(int i = 0; i < list.length; i++){
			newList[i] = list[i];
		}
		return newList;
	}
	
	public static void tokens(){
		String line = "CS 1301 Fall 2015";
		String[] tokens = line.split(" ");
		
		for(int i = 0; i < tokens.length; i++){
			System.out.println(tokens[i]);
		}
	}
	
	
	
	
	
	
	
	
}
