package com.newProject.Real_Project;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{
    public int[] retrievData(){
        return new int[]{1,2,3,4,5};
    }
}
