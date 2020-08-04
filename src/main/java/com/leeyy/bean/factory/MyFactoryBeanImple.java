package com.leeyy.bean.factory;

import com.leeyy.bean.AirPlane;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBeanImple implements FactoryBean<AirPlane> {
    //返回创建对象
    @Override
    public AirPlane getObject() throws Exception {
        AirPlane airPlane = new AirPlane();
        airPlane.setJzName("ssasassa");
        return airPlane;
    }
    //返回创建类型
    @Override
    public Class<?> getObjectType() {
        return AirPlane.class;
    }
    //是否单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
