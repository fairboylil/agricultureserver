package com.hbgc.agricultureserver.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties(value="hibernateLazyInitializer")
public class RealTimeData extends BaseEntity implements Serializable,Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String company;//企业
    private String area;//地区
    private String airTemperature;//空气温度
    private String soilTemperature;//土壤温度
    private String airHumidity;//空气湿度
    private String soilHumidity;//土壤湿度
    private String time;//测量时间
    private String illumination;//光照强度
    private String carbon;//二氧化碳浓度
    private String windDirection;//风向
    private String windSpeed;//风速
    private String pressure;//大气压力
    private String rainfall;//雨量
    private String sunshine;//日照时数
    private String pm;//PM2.5
    private String evaporation;//蒸发
    private String ultravioletRay;//紫外线
    private String  TotalRadiationTable;//总辐射表
    private String moistureOnTheLeaf1;//叶面湿度1
    private String moistureOnTheLeaf2;//叶面湿度2
    private String moistureOnTheLeaf3;//叶面湿度3
    private String moistureOnTheLeaf4;//叶面湿度4
    private String leafTemperature1;//页面温度1
    private String leafTemperature2;//页面温度2
    private String leafTemperature3;//页面温度3
    private String leafTemperature4;//页面温度4


}