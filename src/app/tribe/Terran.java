package app.tribe;

public class Terran extends Tribe {

	/**
	 * 미네랄
	 */
	private Integer mineral;

	/**
	 * 가스
	 */
	private Integer gas;

	/**
	 * 현재 일꾼 수
	 */
	private Integer workmanCnt;

	/**
	 * 현재 인구수
	 */
	private Integer currentPopulation;

	/**
	 * 최대 인구수
	 */
	private Integer maxPopulation;

	/**
	 * 종족명
	 */
	private String name;

	public Terran() {
		this.mineral = 0;
		this.gas = 4;
		this.currentPopulation = 4;
		this.maxPopulation = 8;
		this.workmanCnt = 4;
		this.name = "테란";
	}

	@Override
	void makingMineral() {

	}

	@Override
	void makingGax() {

	}

	@Override
	void upGradePopulation() {

	}

	@Override
	public Integer getMineral() {
		return mineral;
	}

	@Override
	public Integer getGas() {
		return gas;
	}

	@Override
	public Integer getCurrentPopulation() {
		return currentPopulation;
	}

	@Override
	public Integer getMaxPopulation() {
		return maxPopulation;
	}

	@Override
	public Integer getWorkmanCnt() {
		return workmanCnt;
	}

	@Override
	public String getName() {
		return name;
	}
}
