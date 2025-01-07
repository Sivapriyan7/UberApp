package com.project.uber.uberApp.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@Getter
//@Data
@NoArgsConstructor
public class PointDTO {
    private double[] coordinates;
    private String type = "Point";

    public PointDTO(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
