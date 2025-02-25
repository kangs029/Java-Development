package com.newProject.Real_Project;

import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Primary
//@Component //@Repository is specialization of @component
@Repository
public class MongoDBDataService implements DataService{
    public int[] retrievData(){
        return new int[]{11,22,33,44,55};
    }
}
