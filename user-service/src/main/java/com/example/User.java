package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bartoszjedrzejewski on 08/06/2016.
 */
public class User {

    private final long id;
    private final String forename;
    private final String surname;
    private final String organisation;
    private final List<String> notifications;
    private final long points;
    //Friends are deprecated and should not be used
    private final List<String> friends;

    public User(int id) {
        String[] forenames = {"Alice", "Manjula", "Bartosz", "Mack"};
        String[] surnames = {"Smith", "Salvatore", "Jedrzejewski", "Scott"};
        String[] organisations = {"ScottLogic", "UNICEF"};

        forename = forenames[id%3];
        surname = surnames[id%4];
        organisation = organisations[id%2];
        notifications= new ArrayList<>();
        notifications.add("You have been promoted!");
        notifications.add("Sorry, disregard the previous notifaction- wrong user");
        points = id * 31 % 1000;

        //You have no friends
        friends = new ArrayList<>();

        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getOrganisation() {
        return organisation;
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public long getPoints() {
        return points;
    }

    public List<String> getFriends() {
        return friends;
    }
}
