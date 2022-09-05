import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GameSaleManager;
import Concretes.PlayerCheckManager;
import Concretes.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) throws Exception {

		Player player1 = new Player(1,"abc","abc","12345678912", 2000);
		Player player2 = new Player(2,"def","def","9876543210321",2002);
		
		Game game1 = new Game(1,"Fifa2021",1000);
		Game game2 = new Game(2,"MortalCombat",500);
		
		Campaign campaing1 = new Campaign(1, "StudentCampaing", 20);
		Campaign campaing2 = new Campaign(2, "NewYearCampaing", 15);
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		playerManager.add(player1);
		playerManager.add(player2);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		CampaignManager campaingManager = new CampaignManager();
		campaingManager.add(campaing1);
		campaingManager.add(campaing2);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sale(player1, game1, campaing1);

	}

}
