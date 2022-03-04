public abstract class ProfileFetch {

    /**
     * This function will fetch the name of the summoner that is queried
     */
    abstract void getName();

    /** There are 2 types of IDs regarding League of Legends, the League ID (the game) and the Riot ID (the platform) */

    /**
     * This function will get your League ID
     */
    abstract void getId();

    /**
     * This function will get your Riot ID.
     */
    abstract void getAccountId();

    /**
     * This function shows the current game level of the player
     */
    abstract void getLevel();

    /**
     * This function will get the time in-between the previous API request with the current query to present time
     */
    abstract void getUpdated();

    /**
     * Profile icons are ordered in sequential numbers. As of Feb 2022, there are currently 5268 icons
     */
    abstract void getProfileIconId();

    /**
     * This function will fetch the url of a picture using the ID that has been given at the above function
     * Uses an external host: https://ddragon.leagueoflegends.com
     *
     * Maintenance (replace when new patch is released):
     * https://ddragon.leagueoflegends.com/cdn/12.5.1/img/profileicon/x.png
     *                                         ^^^^^^
     *                                      -- change --
     */
    abstract void getProfileIconURL();

    /**
     * The display function will display all the details with each function initiating an API request.
     */
    public final void display() {
        getName();
        getId();
        getAccountId();
        getLevel();
        getUpdated();
        getProfileIconId();
        getProfileIconURL();
    }
}
