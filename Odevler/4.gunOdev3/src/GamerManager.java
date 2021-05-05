public class GamerManager implements GamerService {
	
	IdentityManager identityManager; 
	
    public GamerManager(IdentityManager identityManager) {
		super();
		this.identityManager = identityManager;
	}

	@Override
    public void add(Gamer gamer) {
		identityManager.control(gamer);
        System.out.println(gamer.getFirstName() + " adl� oyuncu sisteme eklendi.");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " adl� oyuncu sistemde g�ncellendi.");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " adl� oyuncu sistemden silindi.");
    }
}
