package com.melardev.cloud.admin.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class HomeController {
    @GetMapping
    public Map<String, Object> index() {
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        return response;
    }
}
