package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List; // Added this import!

@RestController
@RequestMapping("/api/logs")
@CrossOrigin(origins = "*") 
public class SessionLogController {

    @Autowired
    private SessionLogRepository repository;

    // The POST route we just built (Saves data)
    @PostMapping
    public SessionLog saveSession(@RequestBody SessionLog sessionData) {
        System.out.println("Incoming telemetry caught! Raga: " + sessionData.getRaga());
        return repository.save(sessionData); 
    }

    // THE NEW GET ROUTE (Reads data)
    @GetMapping
    public List<SessionLog> getAllSessions() {
        System.out.println("Dashboard is requesting telemetry data...");
        return repository.findAll(); // This magically writes a "SELECT * FROM session_data" SQL query
    }
}