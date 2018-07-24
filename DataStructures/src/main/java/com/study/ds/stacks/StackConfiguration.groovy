package com.study.ds.stacks

import org.apache.velocity.app.VelocityEngine
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import com.study.ds.stacks.model.DynamicStackImplementation

@Configuration
class StackConfiguration
{
	private static final def SIZE = 5

	@Bean('DefaultDynamicStackImpl')
	DynamicStackImplementation getDefaultDynamicStackImpl()
	{
		new DynamicStackImplementation(SIZE)
	}
	
	@Bean('VelocityEngine')
	VelocityEngine getVelocityEngine()
	{
		new VelocityEngine(getVelocityProperties())
	}
	
	//@Bean('Velocity_props')
	Properties getVelocityProperties()
	{
		def prop = new Properties()
		prop.put('resource.loader', 'class')
		prop.put('class.resource.loader.class', 'org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader')
		prop.put('class.resource.loader.cache', 'true')
		prop.put('runtime.log.logsystem.class', 'org.apache.velocity.runtime.log.Log4JLogChute')
		prop.put('runtime.log.logsystem.log4j.logger.level', 'OFF')
		
		prop
	}
}
