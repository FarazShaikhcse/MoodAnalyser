
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	/*
	 * Method to check if sentance contains word sad
	 */
	public void sadCheck() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
		String mood;
		mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	/*
	 * Method to check if sentance contains word happy
	 */
	@Test
	public void happyCheck() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood;

		mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);

	}

	

}
