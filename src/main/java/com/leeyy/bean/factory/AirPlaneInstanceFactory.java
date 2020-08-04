package com.leeyy.bean.factory;

import com.leeyy.bean.AirPlane;

//实例工厂
public class AirPlaneInstanceFactory {
    public AirPlane getAirPlane(String jzName){
        System.out.println("instance factory...");
        AirPlane airPlane = new AirPlane();
        airPlane.setJzName(jzName);
        return airPlane;
    }
}
