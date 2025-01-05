package com.project.uber.uberApp.dto;


import lombok.Data;

@Data
public class PointDTO {

    private double[] coordintates;
    private String type = "Point";


}
