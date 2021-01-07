package com.thread.sleep;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 모든 경구를 출력하기 위해 Queue(FIFO)를 사용함.
 * 
 * 0. 배열을 리스트로 변환 Arrays.asList(String...)
 * 1. 순서섞기 Collections.shuffle(List)
 * 2. queue에 저장. 
 * 3. Thread 지연을 통해 하나씩 출력
 *
 */
public class SleepTest2 {
	public static void main(String args[]) {
		new SleepTest2().sendAphorism();
		
		System.out.println("프로그램 종료!!");
	}

	public void sendAphorism() {
		String messages[] = {
			"Pride will have a fall.",
			"Power is dangerous unless you have humility.",
			"Office changes manners.", 
			"Empty vessels make the most sound.",
			"Heaven helps those who help themseleves.",
			"Things change.",
			"Forgive yorself before you die. Then forgive others.",
			"Don't let go too soon, but don't hang on too soon.",
			"Accept what you are able to do and what you are not able to do.",
			"Accept what past as past, whthout denying or discarding it."
		};

		
		//0.String[] => List<String>
		List<String> temp = Arrays.asList(messages);
		
		//1.순서섞기
		Collections.shuffle(Arrays.asList(temp));
//		System.out.println(Arrays.toString(temp));
		
		//2.Queue생성
		Queue<String> queue = new LinkedList<>(temp);
		
		while(queue.size() > 0) {
			System.out.println(queue.poll());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
