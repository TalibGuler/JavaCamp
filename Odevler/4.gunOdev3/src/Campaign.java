public class Campaign {

    private int id;
    private String CampaignName;
    private int CampaignPrice;

    public Campaign(int id, String campaignName, int campaignPrice) {
        this.id = id;
        CampaignName = campaignName;
        CampaignPrice = campaignPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return CampaignName;
    }

    public void setCampaignName(String campaignName) {
        CampaignName = campaignName;
    }

    public int getCampaignPrice() {
        return CampaignPrice;
    }

    public void setCampaignPrice(int campaignPrice) {
        CampaignPrice = campaignPrice;
    }

}
