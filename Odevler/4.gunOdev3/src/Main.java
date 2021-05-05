public class Main {
    public static void main(String[] args) {
        Gamer gamer1 = new Gamer(1, "Talib", "Güler", "123");
        Game game1 = new Game(1, "Red Dead Redemption 2", 200);
        Campaign campaign1 = new Campaign(1,"Yaz Kampanyasý",75);
        GamerManager gamerManager = new GamerManager(new IdentityManager());
        GameManager gameManager = new GameManager(new CampaignManager() );
        gamerManager.add(gamer1);
        System.out.println("-------- Kampanyasýz Fiyatý --------");
        gameManager.sell(gamer1, game1);
        
        System.out.println("-------- Kampanyalý Fiyatý ---------");
        gameManager.sellCampaign(gamer1, game1,campaign1);
    }
}
