package com.study.ds.stacks.controller

import static org.apache.velocity.app.Velocity.getTemplate

import static org.springframework.web.bind.annotation.RequestMethod.GET

import org.apache.velocity.Template
import org.apache.velocity.VelocityContext
import org.apache.velocity.context.Context

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import com.study.ds.stacks.service.DynamicStackService

@RestController
class DynamicStackController
{
	@Autowired
	@Qualifier('DynamicStackService')
	DynamicStackService dynamicStackService

	@RequestMapping('/stacks/dynamicStacks')
	String render()
	{
		dynamicStackService.renderDynamicStacksPage()
	}
	
	@RequestMapping(path = '/stacks/dynamicStacks/push', method = GET)
	String dynamicStackPush(@RequestParam int value)
	{
		dynamicStackService.push(value)
	}
	
	@RequestMapping(path = '/stacks/dynamicStacks/pop', method = GET)
	String dynamicStackPop()
	{
		dynamicStackService.pop()
	}
	
	@RequestMapping(path = '/stacks/dynamicStacks/peek', method = GET)
	String dynamicStackPeek()
	{
		dynamicStackService.peek()
	}
	
	@RequestMapping(path = '/stacks/dynamicStacks/display', method = GET)
	String dynamicStackDisplay()
	{
		dynamicStackService.display()
	}
}
