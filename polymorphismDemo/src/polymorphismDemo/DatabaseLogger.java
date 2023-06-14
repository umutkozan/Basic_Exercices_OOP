package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	public class BaseLogger {
	    public void Log(String message) {
	   System.out.println("Log to DataBase :	"+message);
	    }
	}
}
