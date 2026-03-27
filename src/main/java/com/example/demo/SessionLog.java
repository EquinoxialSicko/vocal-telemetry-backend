package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "session_data")
public class SessionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String raga;
    private String pitch;
    private int strainLevel;
    private int durationMins;
    private String timeOfDay;
    private int hydrationLevel;
    private String notes;

    // --- Getters and Setters ---
    
    public String getRaga() { return raga; }
    public void setRaga(String raga) { this.raga = raga; }

    public String getPitch() { return pitch; }
    public void setPitch(String pitch) { this.pitch = pitch; }

    public int getStrainLevel() { return strainLevel; }
    public void setStrainLevel(int strainLevel) { this.strainLevel = strainLevel; }

    public int getDurationMins() { return durationMins; }
    public void setDurationMins(int durationMins) { this.durationMins = durationMins; }

    public String getTimeOfDay() { return timeOfDay; }
    public void setTimeOfDay(String timeOfDay) { this.timeOfDay = timeOfDay; }

    public int getHydrationLevel() { return hydrationLevel; }
    public void setHydrationLevel(int hydrationLevel) { this.hydrationLevel = hydrationLevel; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}