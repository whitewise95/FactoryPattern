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
		while (true) {
			inGame(tribe);
		}
	}

	/**
	 * 인게임
	 */
	public static void inGame(Tribe tribe) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("행동을 선택해주세요.");
		System.out.println("1. 미네랄캐기  2.상태보기  3.건물짓기");
		int answer = scanner.nextInt();

		switch (answer) {
			case 1 -> {

			}
			case 2 -> {

			}
			case 3 -> {

			}
		}
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
			Thread.sleep(500);
			System.out.println("게임 설명");
			System.out.println("1.10단계까지 웨이브가 있으며  자원을 모으고 병력을 모아 전부 막아내면 됩니다.");
			Thread.sleep(2000);
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
