
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	/*
	 * Method to check if sentence contains word sad
	 */
	public void sadCheck() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalyserException e) {
			System.out.println("Empty Mood: " + e);
		}

	}

	/*
	 * Method to check if sentence contains word happy
	 */
	@Test
	public void happyCheck() {
		MoodAnalyser moodAnalyser;

		moodAnalyser = new MoodAnalyser(null);

		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
