package com.reactspringboot.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Controller {


    @GetMapping("/getString")
   public ResponseEntity<Map<String, String>> getString(){

        Map<String, String> value = new HashMap<>();
        value.put("message", "i Am from spring boot");
        return ResponseEntity.ok(value);
    }
}
