package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameSaleService {
	void sale(Player player,Game game,Campaign campaign);
}	
