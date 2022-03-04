/**
 * This class will gather only basic information regarding the query.
 * A quicker and simpler function will be needed in order reduce unused API requests amount to the Riot API
 */
public class QuickFetch extends ProfileFetch {

    @Override
    void getName() {
        System.out.println("Summoner Name: " + "Duelblade");
    }

    /**
     * For quick glances, this is not needed
     * Therefore, leave blank. DO NOT make request to API
     */
    @Override
    void getId() {

    }

    @Override
    void getAccountId() {
        System.out.println("Riot ID: " + "Duelblade#NA1");
    }

    @Override
    void getLevel() {
        System.out.println("Level: " + "215");
    }

    /**
     * For quick glances, this is not needed
     */
    @Override
    void getUpdated() {

    }

    @Override
    void getProfileIconId() {
        System.out.println("Icon ID: " + "758");
    }

    @Override
    void getProfileIconURL() {
        System.out.println("https://ddragon.leagueoflegends.com/cdn/12.5.1/img/profileicon/758.png");
    }

}
