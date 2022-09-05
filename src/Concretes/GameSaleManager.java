package Concretes;

import Abstracts.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleService{

	@Override
	public void sale(Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstName() + " adli oyuncu " + game.getName() +  " adli oyunu %" + campaign.getDiscount() + " indirimle satin aldi");
		
	}

}
