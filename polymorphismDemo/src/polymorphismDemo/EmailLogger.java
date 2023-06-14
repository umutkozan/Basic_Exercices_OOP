package polymorphismDemo;

public class EmailLogger extends BaseLogger{
	public class BaseLogger {
	    public void Log(String message) {
	    	System.out.println("Log to Email :" +message);
	    }
	}
}
