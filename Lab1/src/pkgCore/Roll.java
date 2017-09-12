package pkgCore;

public class Roll extends Die{

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		d1 = new Die();
		d2 = new Die();
		
		Score = d1.getDieValue() + d2.getDieValue();
	}

	public int getScore() {
		return Score;
	}

	public Die getD1() {
		return d1;
	}

	public void setD1(Die d1) {
		this.d1 = d1;
	}

	public Die getD2() {
		return d2;
	}

	public void setD2(Die d2) {
		this.d2 = d2;
	}
}

	