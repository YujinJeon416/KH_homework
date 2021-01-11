package ncs.test5;

public class BookArrayTest {
    public static void main(String args[]) {
    	Book bArray[] = new Book[3];
		// Book객체를3개생성하여배열에넣는다.
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "도우출판", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "도우출판", 0.1);

		// 배열에있는객체정보를모두getter 로출력한다. –for 문을이용할것
		for (int i = 0; i < bArray.length; i++) {
			System.out.println(bArray[i].getTitle() +", " + bArray[i].getAuthor() +", " + bArray[i].getPublisher() + ", "+bArray[i].getPrice()+", "+ (int)(bArray[i].getDiscountRate() * 100) + "% 할인");
			System.out.println("할인된 가격 : " + (int)(bArray[i].getPrice()*(1-bArray[i].getDiscountRate()))+"원");
		}

		// 실행결과와같이계산출력
    }
}
