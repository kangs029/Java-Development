package com.newProject.Real_Project;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Component // @service is specialization of @component
@Service
public class BusinessCalculationService {
    private DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService){
        super();
        this.dataService=dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrievData())
                     .max().orElse(0);
    }
    
}
