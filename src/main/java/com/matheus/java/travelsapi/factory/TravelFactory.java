package com.matheus.java.travelsapi.factory;

import com.matheus.java.travelsapi.model.Travel;

public interface TravelFactory {

    Travel createTravel(String type);
}
