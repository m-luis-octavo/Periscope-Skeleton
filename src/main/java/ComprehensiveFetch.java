/**
 * Comprehensive Fetch will gather all possible details regarding the 'summoner'
 */

public class ComprehensiveFetch extends ProfileFetch {
    @Override
    void getName() {
        System.out.println("Summoner Name: " + "Destly");
    }

    @Override
    void getId() {
        System.out.println("Summoner ID: " + "5000-2150");
    }

    @Override
    void getAccountId() {
        System.out.println("Riot ID: " + "Destly#NA1");
    }

    @Override
    void getLevel() {
        System.out.println("Level: " + "359");
    }

    @Override
    void getUpdated() {
        System.out.println("Last Updated: " + "17 minutes ago");
    }

    @Override
    void getProfileIconId() {
        System.out.println("Icon ID: " + "5202");
    }

    @Override
    void getProfileIconURL() {
        System.out.println("https://ddragon.leagueoflegends.com/cdn/12.5.1/img/profileicon/5202.png");
    }

}
