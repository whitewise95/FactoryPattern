package app;

import app.factorys.TribeFactory;
import app.tribes.Tribe;
import java.util.Scanner;

public class StartCraftApplication {

	/**
	 * 메인
	 */
	public static void main(String[] args) {
		Tribe tribe = tribeChoose();
		startPrint(tribe);
	}

	/**
	 * 종족선택
	 */
	public static Tribe tribeChoose() {
		Scanner scanner = new Scanner(System.in);
		TribeFactory tribeFactory = new TribeFactory();
		System.out.println("종족을 선택해주세요.");
		System.out.println("테란,  저그,  프로토스");
		String answer = scanner.next();
		if (answer.equals("테란") || answer.equals("저그") || answer.equals("프로토스")) {
			return tribeFactory.getTribe(answer);
		} else {
			System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
			return tribeChoose();
		}
	}

	/**
	 * 게임시작 문구
	 */
	public static void startPrint(Tribe tribe) {
		try {
			System.out.println(tribe.getName() + "을 선택하셨습니다.");
			System.out.println(" 게임 3초후 시작");
			Thread.sleep(1000);
			System.out.println(" 1.......");
			Thread.sleep(1000);
			System.out.println(" 2.......");
			Thread.sleep(1000);
			System.out.println(" 3.......");
		} catch (Exception e) {
			throw new RuntimeException("네트워크 에러 다시 시작해주세요.");
		}
	}
}
