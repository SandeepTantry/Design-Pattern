package com.study.ds.stacks.service

import org.apache.velocity.VelocityContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

import com.study.ds.stacks.model.DynamicStackImplementation
import com.study.ds.stacks.util.VelocityUtil

@Service('DynamicStackService')
class DynamicStackService
{
	@Autowired
	@Qualifier('DefaultDynamicStackImpl')
	DynamicStackImplementation dynamicStackImpl
	
	@Autowired
	@Qualifier('VelocityUtil')
	VelocityUtil velocityUtil
	
	String push(int value)
	{
		dynamicStackImpl.push(value)
	}
	
	String pop()
	{
		dynamicStackImpl.pop()
	}
	
	String peek()
	{
		dynamicStackImpl.peek()
	}
	
	String display()
	{
		dynamicStackImpl.displayFullElements()
	}
	
	String renderDynamicStacksPage()
	{
		def writer = new StringWriter()
		def context = new VelocityContext()
		def template = velocityUtil.getTemplate('com/study/ds/stacks/templates/DynamicStacks.vm')
		
		template.merge(context, writer)
		
		writer.toString()
	}
}
