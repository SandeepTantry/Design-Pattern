package org.test.dp.structural.proxy.model;

public class CommandExecutorImpl implements CommandExecutor
{
	@Override
	public void runCommand(final String cmd) throws Exception
	{
		Runtime rt = Runtime.getRuntime();
		System.out.println("Executing cmd [" + cmd + "]...");
		rt.exec(cmd);
		System.out.println("cmd Executed..");
	}
}
