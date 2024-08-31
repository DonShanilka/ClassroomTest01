package com.example.ais.bean;

import com.example.ais.bakery.Food;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements Food {
    @Override
    public void sell() {
        System.out.println("Preference is Fish Pastry");//2
    }
}
