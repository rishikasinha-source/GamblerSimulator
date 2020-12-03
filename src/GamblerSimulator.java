
public class GamblerSimulator {

	private static double winloss;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Gambler Simulator Problem");
		int startStake= 100;
		int bet=1;
		game();
	}
	
		public static int game() {
		int result=  (int) Math.floor((Math.random()*10))%2;
		if(result==1) {
			
			System.out.println("Gambler Wins");	
			return result;
		}
		else {
			System.out.println("Gambler Loss");
			return result-1;
		}
	}
	
}
