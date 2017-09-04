package org.test.dp.structural.proxy.model;

public class CommandExecutorImplProxy implements CommandExecutor
{
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorImplProxy(final String userId, final String pwd)
	{
		if ("admin".equals(userId) && "password".equals(pwd))
		{
			isAdmin = true;
		}
		executor = new CommandExecutorImpl();
	}
	
	@Override
	public void runCommand(final String cmd) throws Exception
	{
		if (!isAdmin && cmd.trim().startsWith("del"))
		{
			System.out.println("You do not have suffecient permissions to run the cmd [" + cmd + "]");
		}
		else
		{
			executor.runCommand(cmd);
		}
	}
}
