package com.example.ais.bean;

import com.example.ais.bakery.Food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishBun implements Food {

    @Override
    public void sell() {
        System.out.println("Preference is Fish Bun");//1
    }
}
