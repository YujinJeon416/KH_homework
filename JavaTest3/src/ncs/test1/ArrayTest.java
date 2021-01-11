package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
		
		double sum = 0, avg = 0;
		int count = 0;//2차원배열 전체 요소수
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		
		avg = sum/count;
		System.out.printf("합계 : %.2f%n평균 : %.2f",sum,avg);
	}

}
