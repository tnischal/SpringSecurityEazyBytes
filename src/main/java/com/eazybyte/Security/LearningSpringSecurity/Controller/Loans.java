package com.eazybyte.Security.LearningSpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Loans {

    @GetMapping("/myLoans")
    public String getAccountDetails() {
        return "Here are the loans details from the DB";
    }
}
