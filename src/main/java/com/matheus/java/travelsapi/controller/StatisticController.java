package com.matheus.java.travelsapi.controller;

import com.matheus.java.travelsapi.model.Travel;
import com.matheus.java.travelsapi.service.StatisticService;
import com.matheus.java.travelsapi.model.Statistic;
import com.matheus.java.travelsapi.service.TravelService;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-travels/statistics")
public class StatisticController {
    public static final Logger logger = Logger.getLogger(TravelController.class);

    final private TravelService travelService;
    final private StatisticService statisticService;
    public StatisticController(TravelService travelService, StatisticService statisticService) {
        this.travelService = travelService;
        this.statisticService = statisticService;
    }
    @GetMapping(produces = {"application/json"})
    public ResponseEntity<Statistic>getStatistics(){

        List<Travel> travels = travelService.find();
        Statistic statistics = statisticService.create(travels);

        logger.info(statistics);

        return ResponseEntity.ok(statistics);

    }


}
