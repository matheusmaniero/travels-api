package com.matheus.java.travelsapi.factory;

import com.matheus.java.travelsapi.model.Travel;
import com.matheus.java.travelsapi.enumeration.TravelTypeEnum;

public class TravelFactoryImpl implements TravelFactory {


    @Override
    public Travel createTravel(String type) {

        if (TravelTypeEnum.ONE_WAY.getValue().equals(type)){
            return new Travel(TravelTypeEnum.ONE_WAY);
        }else if (TravelTypeEnum.MULTI_CITY.getValue().equals(type)){
            return new Travel(TravelTypeEnum.MULTI_CITY);
        }

        return new Travel(TravelTypeEnum.RETURN);

    }
}
