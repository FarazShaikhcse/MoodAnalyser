
public class MoodAnalyser {
	String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalyserException{
		try {
			if (message == "")
				throw new MoodAnalyserException("Please enter non empty message");
			if (message.contains(("sad"))) {
				return "SAD";
			} else
				return "HAPPY";
		} catch (NullPointerException e) {
			System.out.println("Message should not be null");
			return "";
		}
		
	}

}
