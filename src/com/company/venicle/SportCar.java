package com.company.venicle;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.venicle.Car;

public class SportCar extends Car {
    private int maxSpeed;
    public SportCar(String brand,String carClass,int weight,Driver driver,Engine engine,int maxSpeed){
        super(brand,carClass, weight,driver,engine);
        this.maxSpeed=maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    @Override
    public String toString(){
        return super.toString()+"\nМаксимальная скорость: "+maxSpeed+"\n}";
    }
}