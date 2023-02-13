package app.tribes;

public class Zerg extends Tribe{
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

	public Zerg() {
		this.mineral = 0;
		this.gas = 0;
		this.currentPopulation = 4;
		this.maxPopulation = 9;
		this.workmanCnt = 4;
		this.name = "저그";
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
		return this.mineral;
	}

	@Override
	public Integer getGas() {
		return this.gas;
	}

	@Override
	public Integer getCurrentPopulation() {
		return this.currentPopulation;
	}

	@Override
	public Integer getMaxPopulation() {
		return this.maxPopulation;
	}

	@Override
	public Integer getWorkmanCnt() {
		return this.workmanCnt;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
