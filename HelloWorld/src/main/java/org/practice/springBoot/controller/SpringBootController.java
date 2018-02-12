package org.practice.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author U6024965
 *
 * <pre>
 *   As we have created our main class in <i>org.practice.springBoot</i> package,
 *   while starting our application, it will scan all the components under that package
 * </pre>
 */
@RestController
public class SpringBootController
{
    @RequestMapping("/")
    public String welcome()
    {
        return "Welcome to Spring Boot";
    }

    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello";
    }
}
