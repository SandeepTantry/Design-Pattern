package com.study.ds.main

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan('com.study.ds')
class MainEntry
{
	static main(args)
	{
		SpringApplication.run(MainEntry, args)
	}
}
