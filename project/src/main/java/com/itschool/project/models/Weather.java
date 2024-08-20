package com.itschool.project.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Weather {

    private String city;
    private String description;
    private LocalDateTime lastUpdate;
}