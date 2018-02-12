package org.practice.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author U6024965
 *
 * <pre>
 *   For every spring boot application we have to create a main class and
 *   that need to be annotate with <b>@SpringBootApplication</b> and
 *   bootstrap it
 * </pre>
 */
@SpringBootApplication
@ComponentScan("org.practice")
public class SpringBootApp
{
    public static void main(final String[] args)
    {
        SpringApplication.run(SpringBootApp.class, args);
    }
}
