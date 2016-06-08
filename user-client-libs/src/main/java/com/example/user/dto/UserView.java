package com.example.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bartoszjedrzejewski on 08/06/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserView {

    private long id;
    private String forename;
    private String surname;
    private String organisation;
    private List<String> notifications;
    private long points;

    public UserView(){

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
}
