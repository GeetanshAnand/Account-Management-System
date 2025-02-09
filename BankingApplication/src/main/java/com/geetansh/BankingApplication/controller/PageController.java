package com.geetansh.BankingApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // Serve the index page from the static folder
    @GetMapping("/")
    public String index() {
        return "forward:/index.html"; // This serves index.html from the static folder
    }

    // Serve the add account page from the templates folder
    @GetMapping("/add-account")
    public String addAccount(Model model) {
        // You can add attributes to the model if needed
        return "add-account.html"; // This serves add-account.html from the templates folder
    }

    // Serve the view accounts page from the templates folder
    @GetMapping("/view-accounts")
    public String viewAccounts(Model model) {
        // You can add attributes to the model if needed
        return "view-accounts"; // This serves view-accounts.html from the templates folder
    }

    // Serve the account operations page from the templates folder
    @GetMapping("/account-operations")
    public String accountOperations(Model model) {
        // You can add attributes to the model if needed
        return "account-operations"; // This serves account-operations.html from the templates folder
    }

    @GetMapping("/search-account")
    public String searchAccount(Model model) {
        // You can add attributes to the model if needed
        return "search-account"; // This serves account-operations.html from the templates folder
    }

    @GetMapping("/home")
    public String home() {
        return "home"; // Serve home.html after successful login
    }
}

