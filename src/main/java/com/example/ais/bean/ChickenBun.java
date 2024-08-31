package com.example.ais.bean;

import com.example.ais.bakery.Food;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("NextHunger")
public class ChickenBun implements Food {
    @Override
    public void sell() {
        System.out.println("Preference is Chicken Bun");//3
    }
}
