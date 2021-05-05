public class Game {

    private int id;
    private String GameName;
    private int UnitPrice;

    public Game(int id, String gameName, int unitPrice) {
        this.id = id;
        GameName = gameName;
        UnitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String gameName) {
        GameName = gameName;
    }

    public int getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        UnitPrice = unitPrice;
    }

}
