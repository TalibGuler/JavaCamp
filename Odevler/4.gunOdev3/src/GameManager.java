public class GameManager implements GameService {
	
	CampaignManager campaignManager;
    public GameManager(CampaignManager campaignManager) {
		super();
		this.campaignManager = campaignManager;
	}
	@Override
    public void sell(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName() + " adlý oyuncu " + game.getGameName() + " oyununu " + game.getUnitPrice() + " fiyatla aldý.");
    }
	@Override
    public void sellCampaign(Gamer gamer, Game game,Campaign campaign) {
        System.out.println(gamer.getFirstName() + " adlý oyuncu " + game.getGameName() + " oyununu " + campaign.getCampaignName()+ " kampanyasý ile "+ campaign.getCampaignPrice() + " fiyatla aldý.");
    }
}
