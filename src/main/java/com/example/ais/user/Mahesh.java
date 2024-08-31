package com.example.ais.user;

import com.example.ais.bakery.Food;
import com.example.ais.customAnnotation.Prefer;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {
    private Food food;

    public Mahesh() {
    }

    @Autowired
    @Qualifier("NextHunger")
    @Prefer
    public void setFood(Food food){
     this.food = food;
    }

    @PostConstruct
    public void init(){
        food.sell();
    }
}
