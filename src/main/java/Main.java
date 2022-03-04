/**
 * Michael Luis Octavo
 * Periscoop profile checker skeleton code
 *
 * Terms:
 * 'Summoner' = Player / User
 *
 * This project is a barebones example of a project I am currently working on the side about the game 'League of Legends'
 * The project communicates through the Riot API to get its details.
 *
 * For Assignment 1, I grabbed my "ProfileFetch" and implemented the Template Design Pattern. The design pattern
 * proved useful and showed where my code can be more efficient.
 *
 * The current application fetches through the Riot API 7 times per Summoner. Using the design pattern, I made the
 * 'ProfileFetch' function into an abstract one and fragmented them into different classes for different needs.
 *
 * In this assignment, there are two types of fetching. 'ComprehensiveFetch' performs a complete lookup of the summoner.
 * 'QuickFetch' is a leaner version with some functions omitted for quick glance requests.
 */

public class Main {
    public static void main(String[] args) {
        /**
         * We will fetch a profile two static players as an example, any use and dependencies of the Riot API and
         * the unofficial java wrapper 'orianna' has been removed
         */

        /**
         * The user named 'Destly' will be assigned a comprehensive fetch. For the sake of privacy, all numerical
         * values in this example is not real.
         */
        ProfileFetch Destly = new ComprehensiveFetch();
        Destly.display();

        /** Spacer */
        System.out.println();

        /**
         * The user named 'Duelblade' will be assigned a quick fetch. For the sake of privacy, all numerical
         * values in this example is not real.
         */
        ProfileFetch Duelblade = new QuickFetch();
        Duelblade.display();

    }
}
