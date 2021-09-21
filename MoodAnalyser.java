
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
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY_MESSAGE,"Please enter a non empty message");
			if (message.contains(("sad"))) {
				return "SAD";
			} else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL_MESSAGE, "Entered message is null");
		}
		
	}

}
