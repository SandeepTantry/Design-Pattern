package org.test.dp.structural.proxy.test;

import org.test.dp.structural.proxy.model.CommandExecutorImpl;

public class ProxyTester
{
	public static void main(String[] args)
	{
		CommandExecutorImpl normalExecutor = new CommandExecutorImpl();
		try
		{
			normalExecutor.runCommand("dir");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
