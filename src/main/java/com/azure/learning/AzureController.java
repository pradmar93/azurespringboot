package com.azure.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/azure")
public class AzureController {

    @GetMapping("/test")
    public String test(){
        return "success";
    }

}
