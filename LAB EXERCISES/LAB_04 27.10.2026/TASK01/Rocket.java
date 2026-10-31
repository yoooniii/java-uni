public class Rocket implements Vehicle {
	private static String correct="Launch_8673";
	
	@Override
	public void transport(String code) throws LaunchException {
		if(!correct.equals(code)) throw new LaunchException("Ракетата не може да бъде изстреляна.");
		else System.out.println("Ракетата беше изстреляна.");
		
	}
}
class LaunchException extends Exception{
	public LaunchException(String message) {
			super(message);
	}
	
}
