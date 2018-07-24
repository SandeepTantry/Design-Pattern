package com.study.ds.stacks.service

import org.apache.velocity.VelocityContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

import com.study.ds.stacks.util.VelocityUtil

@Service('StackService')
class StackService
{
	@Autowired
	@Qualifier('VelocityUtil')
	VelocityUtil velocityUtil
	
	String renderStacksPage()
	{
		def writer = new StringWriter()
		def context = new VelocityContext()
		def template = velocityUtil.getTemplate('com/study/ds/stacks/templates/StacksHome.vm')
		
		template.merge(context, writer)
		
		writer.toString()
	}
}
