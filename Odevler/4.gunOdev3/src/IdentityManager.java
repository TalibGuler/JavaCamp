public class IdentityManager implements IdentityService {
    @Override
    public void control(Gamer gamer) {
        System.out.println(gamer.getIdentyNumber() + " kay�tl� numara sistemde " + gamer.getFirstName() + " adl� kullan�c� ile e�le�tirildi.");
        System.out.println("Sistemden do�rulama ba�ar�l�");
    }
}
