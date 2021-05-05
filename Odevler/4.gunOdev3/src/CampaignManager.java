public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " isimli kampanya sisteme eklendi.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " isimli kampanya sistemde g�ncellendi.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " isimli kampanya sistemden silindi.");
    }
}
