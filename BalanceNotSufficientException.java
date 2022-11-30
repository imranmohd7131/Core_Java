package custom_exception;

public class BalanceNotSufficientException extends RuntimeException{
	String message;
	public BalanceNotSufficientException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		  return message;
	}
	
}
