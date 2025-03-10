package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QBcontroller {

    @GetMapping("/")
    public String login() {
        return "login"; // returns login.html
    }

    @GetMapping("/home")
    public String homepage() {
        return "homepage"; // returns homepage.html
    }

    @GetMapping("/customers")
    public String customers() {
        return "Customers"; // returns Customers.html
    }

    @GetMapping("/employee")
    public String manageEmployee() {
        return "Employee"; // returns Employee.html
    }

    @GetMapping("/products")
    public String manageProducts() {
        return "products"; // returns products.html
    }

    @GetMapping("/billing")
    public String manageBilling() {
        return "index"; // returns index.html
    }

    @GetMapping("/error")
    public String errorPage() {
        return "error"; // returns error.html
    }

    @GetMapping("/analysis")
    public String analysis() {
        return "analysis"; // returns analysis.html
    }

    @GetMapping("/transaction")
    public String transaction() {
        return "transaction"; // returns transaction.html
    }
}