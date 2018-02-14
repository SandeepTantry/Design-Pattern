package org.practice.springBoot.server;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 * @author U6024965
 *
 * <pre>
 *   This is a strategy interface for customizing auto-configured embedded servlet containers,
 *   and we need to override <i>customize()</i> method of <b>EmbeddedServletContainerCustomizer</b> interface
 * </pre>
 */
@Component
public class Server implements EmbeddedServletContainerCustomizer
{
    @Override
    public void customize(final ConfigurableEmbeddedServletContainer container)
    {
        container.setPort(2018); // Properties overridden in this file will take precedence over .properties file
        container.setContextPath("/Test");
    }
}
