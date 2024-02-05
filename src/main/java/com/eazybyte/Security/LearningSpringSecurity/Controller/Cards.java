package com.eazybyte.Security.LearningSpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cards {

    @GetMapping("/myCards")
    public String getAccountDetails() {
        return "Here are the cards details from the DB";
    }
}
