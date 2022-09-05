package Concretes;


import Abstracts.PlayerCheckService;
import Abstracts.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) throws Exception {
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Oyuncu eklendi : " + player.getFirstName());
		}
		else {
			System.out.println("Kullanıcı bilgileri hatali veya eksik");
		}
		
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi : "+ player.getFirstName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu güncellendi : "+ player.getFirstName());
		
	}

}
