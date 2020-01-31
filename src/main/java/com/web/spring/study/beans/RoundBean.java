
package com.web.spring.study.beans;

public class RoundBean {
    private double rundArea;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double Radius) {
        this.radius = Radius;
    }
    
    public double getRundArea() {
        return getRadius()*getRadius()*Math.PI;
    }

    public void setRundArea(double rundArea) {
        this.rundArea = rundArea;
    }
    
}
