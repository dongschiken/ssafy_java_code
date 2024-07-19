package modifier06_singleton;

public class ScoreManager {
	int score;
	private ScoreManager() {}
	
	// 인스턴스를 1개 만들어서 가지고 있기
	private static ScoreManager scoreManager = new ScoreManager();
	
	// get메서드를 만들어서 인스턴스 생성없이 호출만 하면 scoreManager를 돌려줌
	// static으로 지정해서 생성자를 통해 생성하지 않고도 사용할 수 있도록 만듦
	public static ScoreManager getInstance() {
		return scoreManager;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ScoreManager getScoreManager() {
		return scoreManager;
	}

	public void setScoreManager(ScoreManager scoreManager) {
		this.scoreManager = scoreManager;
	}
	
	// 싱글톤 패턴
	
}
