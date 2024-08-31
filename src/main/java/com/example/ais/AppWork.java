package com.example.ais;

import com.example.ais.app.Transaction;
import com.example.ais.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppWork {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Transaction transaction = (Transaction) ctx.getBean("transaction");
        transaction.startTransaction();
        transaction.endTransaction();
        ctx.registerShutdownHook();
    }
}
