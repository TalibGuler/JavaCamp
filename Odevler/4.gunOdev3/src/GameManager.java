public class GameManager implements GameService {
	
	CampaignManager campaignManager;
    public GameManager(CampaignManager campaignManager) {
		super();
		this.campaignManager = campaignManager;
	}
	@Override
    public void sell(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName() + " adl� oyuncu " + game.getGameName() + " oyununu " + game.getUnitPrice() + " fiyatla ald�.");
    }
	@Override
    public void sellCampaign(Gamer gamer, Game game,Campaign campaign) {
        System.out.println(gamer.getFirstName() + " adl� oyuncu " + game.getGameName() + " oyununu " + campaign.getCampaignName()+ " kampanyas� ile "+ campaign.getCampaignPrice() + " fiyatla ald�.");
    }
}
