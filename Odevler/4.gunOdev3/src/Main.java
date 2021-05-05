public class Main {
    public static void main(String[] args) {
        Gamer gamer1 = new Gamer(1, "Talib", "G�ler", "123");
        Game game1 = new Game(1, "Red Dead Redemption 2", 200);
        Campaign campaign1 = new Campaign(1,"Yaz Kampanyas�",75);
        GamerManager gamerManager = new GamerManager(new IdentityManager());
        GameManager gameManager = new GameManager(new CampaignManager() );
        gamerManager.add(gamer1);
        System.out.println("-------- Kampanyas�z Fiyat� --------");
        gameManager.sell(gamer1, game1);
        
        System.out.println("-------- Kampanyal� Fiyat� ---------");
        gameManager.sellCampaign(gamer1, game1,campaign1);
    }
}
