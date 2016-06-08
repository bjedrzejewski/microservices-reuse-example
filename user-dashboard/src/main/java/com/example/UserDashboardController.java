package com.example;

import com.example.user.dto.UserView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by bartoszjedrzejewski on 09/06/2016.
 */
@RestController
public class UserDashboardController {

    @RequestMapping("/dashboard")
    public String getUser(@RequestParam(value="id", defaultValue="1") int id) {
        RestTemplate restTemplate = new RestTemplate();
        UserView user = restTemplate.getForObject("http://localhost:9001/user?id="+id, UserView.class);
        return "USER DASHBOARD <br>" +
                "Welcome " + user.getForename() +" "+user.getSurname()+"<br>"+
                "You have " +user.getPoints() + " points! Good job!<br>"+
                "<br>"+
                "<br>"+user.getOrganisation();
    }

}
