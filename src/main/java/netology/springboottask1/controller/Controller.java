package netology.springboottask1.controller;

import netology.springboottask1.profile.SystemProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    SystemProfile systemProfile;

    @GetMapping("/profile")
    public String getProfile(){
        return systemProfile.getProfile();
    }
}
