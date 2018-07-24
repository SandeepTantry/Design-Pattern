package com.study.ds.stacks.controller

import java.nio.file.Path

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import com.study.ds.stacks.service.StackService

@RestController
class StackController
{
	@Autowired
	@Qualifier('StackService')
	StackService stackService
	
	@RequestMapping(path = '/stacks')
    String redirect()
	{
		stackService.renderStacksPage()
	}
}
