public class IdentityManager implements IdentityService {
    @Override
    public void control(Gamer gamer) {
        System.out.println(gamer.getIdentyNumber() + " kayýtlý numara sistemde " + gamer.getFirstName() + " adlý kullanýcý ile eþleþtirildi.");
        System.out.println("Sistemden doðrulama baþarýlý");
    }
}
