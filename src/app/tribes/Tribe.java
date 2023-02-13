package app.tribes;

public abstract class Tribe {

	public abstract Integer getMineral();
	public abstract Integer getGas();
	public abstract Integer getCurrentPopulation();
	public abstract Integer getMaxPopulation();
	public abstract Integer getWorkmanCnt();
	public abstract String getName();

	/**
	 * 미네랄 캐기
	 */
	abstract void makingMineral();

	/**
	 * 가스 캐기
	 */
	abstract void makingGax();

	/**
	 * 인구 수 업그레이드
	 */
	abstract void upGradePopulation();
}
