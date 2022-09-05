package Concretes;

import Abstracts.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

}
