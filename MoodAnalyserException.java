
public class MoodAnalyserException extends Exception {
	 public enum ExceptionType {
	        NULL_MESSAGE,
	        EMPTY_MESSAGE
	    }
	public ExceptionType type;
	public MoodAnalyserException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
