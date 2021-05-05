public class GamerManager implements GamerService {
	
	IdentityManager identityManager; 
	
    public GamerManager(IdentityManager identityManager) {
		super();
		this.identityManager = identityManager;
	}

	@Override
    public void add(Gamer gamer) {
		identityManager.control(gamer);
        System.out.println(gamer.getFirstName() + " adlý oyuncu sisteme eklendi.");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " adlý oyuncu sistemde güncellendi.");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " adlý oyuncu sistemden silindi.");
    }
}
