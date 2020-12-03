
public class GamblerSimulator {

	private static final int Stake = 100;
	private static int goal;
	private static int startStake;
	private static GamblerSimulator gambler;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Gambler Simulator Problem");
		int startStake= 100;
		int bet=1;
		int Stake=100;
		GamblerSimulator gambler=new GamblerSimulator();
		game();
		//gambler.calculate_goal();
		gambler.DaysPlaying();
		
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
		public String calculate_goal() {
			int totalStake=100;
			while(true) {
				int result=game();
				totalStake+=result;
				if(totalStake ==150 || totalStake==50 )
					break;
		}
			System.out.print(totalStake);
			return null;
		}

		public void DaysPlaying() {
			int days = 0;
			int win = 0;
			int loose = 0;
			String result;
			while (days < 20) {
				result = calculate_goal();
				if (result == "win")
					win++;
				else
					loose++;
				days++;
			}
			System.out.println("total win=" + win);
			System.out.println("total loose=" + loose);

			
		}
}


				
				



		
		

