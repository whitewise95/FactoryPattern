package java;

import java.factory.TribeFactory;
import java.util.Scanner;

public class Application {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TribeFactory tribeFactory = new TribeFactory();
		System.out.println("종족을 선택해주세요.");
		System.out.println("테란,  저그,  프로토스");
		String answer = scanner.next();
		tribeFactory.getTribe(answer);


		while (true) {




		}
	}
}
