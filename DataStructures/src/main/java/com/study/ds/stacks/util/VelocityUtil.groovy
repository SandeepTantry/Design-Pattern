package com.study.ds.stacks.util

import java.util.Map
import java.util.Map.Entry

import com.google.common.base.Throwables
import org.apache.velocity.Template
import org.apache.velocity.VelocityContext
import org.apache.velocity.app.VelocityEngine
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component('VelocityUtil')
class VelocityUtil
{
    @Autowired
    @Qualifier('VelocityEngine')
    private VelocityEngine velocityEngine

    Template processTemplate(Template template, Object syncRoot)
    {
		try
		{
			synchronized (syncRoot)
			{
				template.process()
			}
		}
		catch (Exception exception)
		{
			Throwables.throwIfUnchecked(exception)
			throw new RuntimeException(exception)
		}

        template
    }

    void addToContext(VelocityContext velocityContext, Map<String, Object> contextMap)
    {
		contextMap.each { k, v -> velocityContext.put(k, v)}
    }

    Template getTemplate(String path) throws Exception
    {
        velocityEngine.getTemplate(path)
    }
}
