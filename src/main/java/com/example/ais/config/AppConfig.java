package com.example.ais.config;

import com.example.ais.app.Logs;
import com.example.ais.app.Transaction;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Logs.class, Transaction.class})
public class AppConfig {
}
