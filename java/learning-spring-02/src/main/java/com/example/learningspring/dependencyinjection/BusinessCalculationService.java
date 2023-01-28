package com.example.learningspring.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessCalculationService {
    private DataService dataService;

    BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    @Autowired
    public BusinessCalculationService setDataService(@Qualifier("MySqlDataServiceQualifier") DataService dataService) {
        this.dataService = dataService;
        return this;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
