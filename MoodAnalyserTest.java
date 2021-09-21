
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	/*
	 * Method to check if sentence contains word sad
	 */
	public void sadCheck() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalyserException e) {

		}

	}

	/*
	 * Method to check if sentence contains word happy
	 */
	@Test
	public void happyCheck() {
		MoodAnalyser moodAnalyser;

		moodAnalyser = new MoodAnalyser("I am in Any Mood");

		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (Exception e) {
		}

	}

}
