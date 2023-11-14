package com.company.venicle;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public String brand;
    public String carClass;
    public int weight;
    public Driver driver;
    public Engine engine;
    public Car(String brand, String carClass, int weight, Driver driver, Engine engine){
        this.brand=brand;
        this.carClass=carClass;
        this.weight=weight;
        this.driver=driver;
        this.engine=engine;
    }

    public  String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public  String getCarClass(){
        return this.carClass;
    }
    public void setCarClass(String carClass){
        this.carClass=carClass;
    }
    public int getWeight(){
        return this.weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public Driver getDriver(){
        return this.driver;
    }
    public void setDriver(Driver driver){
        this.driver=driver;
    }
    public Engine getEngine(){
        return this.engine;
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    @Override
    public String toString(){
        return "Машина {"+
                "\nМарка авто: "+brand+
                "\nКласс машины: "+carClass+
                "\nВес машины: "+weight+
                "\n"+engine.toString()+";"+
                "\nВодитель: "+driver.toString();
    }
}
