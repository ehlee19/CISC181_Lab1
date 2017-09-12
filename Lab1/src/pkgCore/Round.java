package pkgCore;

import java.util.LinkedList;

public class Round extends Roll{

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	private int count;

	public Round() {
		Roll Comeout = new Roll();
		int ComeOutScore = Comeout.getScore();
		count = 1;
		if(ComeOutScore == 7 || ComeOutScore == 11)
			eGameResult = pkgCore.eGameResult.NATURAL;
		else if(ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12)
			eGameResult = pkgCore.eGameResult.CRAPS;
		else
		{
			int firstround = ComeOutScore;
		
		Roll first = new Roll();
		count++;
		while(first.getScore() != firstround)
		{
			first = new Roll ();
			count++;
			if(first.getScore() == 7) {
				eGameResult = pkgCore.eGameResult.SEVEN_OUT;
			}
			
			}
			
			
			
			
				
		}
		eGameResult = pkgCore.eGameResult.POINT;
		
	}

	public int RollCount() {
		
		return count;
	}

	public int getComeOutScore() {
		return ComeOutScore;
	}

	public void setComeOutScore(int comeOutScore) {
		ComeOutScore = comeOutScore;
	}

	public eGameResult geteGameResult() {
		return eGameResult;
	}

	public void seteGameResult(eGameResult eGameResult) {
		this.eGameResult = eGameResult;
	}

	public LinkedList<Roll> getRolls() {
		return rolls;
	}

	public void setRolls(LinkedList<Roll> rolls) {
		this.rolls = rolls;
	}

}
