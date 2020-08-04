package com.leeyy.bean.factory;

import com.leeyy.bean.AirPlane;

//静态工厂
public class AirPlaneStaticFactory {
    public static AirPlane getAirPlane(String jzName){
        System.out.println("static factory...");
        AirPlane airPlane = new AirPlane();
        airPlane.setJzName(jzName);
        return airPlane;
    }
}
