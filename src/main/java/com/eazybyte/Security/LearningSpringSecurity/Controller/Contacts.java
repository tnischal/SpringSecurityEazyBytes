package com.eazybyte.Security.LearningSpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contacts {

    @GetMapping("/contacts")
    public String getAccountDetails() {
        return "Here are the contact details of Bank";
    }
}
