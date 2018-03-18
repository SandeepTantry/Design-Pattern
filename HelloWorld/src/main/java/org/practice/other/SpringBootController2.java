package org.practice.other;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/other")
public class SpringBootController2
{
    @RequestMapping("/other")
    public String other()
    {
        return "Other page";
    }
}
