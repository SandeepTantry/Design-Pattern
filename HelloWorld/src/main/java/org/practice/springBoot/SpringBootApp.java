package org.practice.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author U6024965
 * 
 * <pre>
 *     for every spring boot application we have to create a main class and
 *     that need to be annotate with <i>@SpringBootApplication</i> and
 *     bootstrap it
 * </pre>
 */
@SpringBootApplication
public class SpringBootApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootApp.class, args);
    }
}
