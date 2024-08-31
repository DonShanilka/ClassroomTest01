package com.example.ais.bean;

import com.example.ais.bakery.Food;
import com.example.ais.customAnnotation.Prefer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("NextHunger")
@Prefer
public class ChickenRoll implements Food {
    @Override
    public void sell() {
        System.out.println("Preference is Chicken Roll");//4
    }
}
