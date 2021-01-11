package ncs.test2;

import java.text.DecimalFormat;

public class StringTest{
	public static void main(String args[]) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[]= new double[5];
		double sum = 0;
		// str에서 데이터를 분리한다.
		String[] st;
		st = str.split(",");
		
		double[] dArr = new double[st.length];
		int idx = 0; //배열인덱스용 변수
		
		//for~each 문 사용한다.
		for(String s : st){
			// 배열에 실수 데이터를 넣는다.
			dArr[idx] = Double.parseDouble(s);
			//배열 데이터의 합을 구한다.
			sum += dArr[idx];
			
			idx++;
		}
		
		// 결과 값을 출력한다.
		DecimalFormat df = new DecimalFormat("0.000");
		System.out.println("합계 : "+df.format(sum));
		System.out.println("합계 : "+df.format(sum/dArr.length));
		
}
}

