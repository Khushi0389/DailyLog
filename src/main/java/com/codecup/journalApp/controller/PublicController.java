package com.codecup.journalApp.controller;

import com.codecup.journalApp.entity.User;
import com.codecup.journalApp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
//@Slf4j
//@Tag(name = "Public APIs")

public class PublicController {

    //@Autowired
   // private AuthenticationManager authenticationManager;
   // @Autowired
    //private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private UserService userService;

   // @Autowired
   // private JwtUtil jwtUtil;

    @GetMapping("/health-check")
    public String healthCheck() {
       // log.info("Health is ok !");
        return "Ok";
    }
    @PostMapping("/create-user")
    public void createUser(@RequestBody User user){
        userService.saveNewUser(user);
    }
}