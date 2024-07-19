package modifier06_singleton;

public class ScoreTest {
    public static void main(String[] args) {
    	
    	ScoreManager scoreManager = ScoreManager.getInstance();
    	scoreManager.setScore(100);
    	int score1 = scoreManager.getScore();
    	scoreManager.setScore(95);
    	int score2 = scoreManager.getScore();
    	
    	ScoreManager scoreManager2 = ScoreManager.getInstance();
    	
    	System.out.println(scoreManager.toString());
    	System.out.println(scoreManager2.toString());
    }
}
