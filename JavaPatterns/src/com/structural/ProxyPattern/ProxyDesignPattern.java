package com.structural.ProxyPattern;

public class ProxyDesignPattern {

	public static void main(String[] args) throws Exception {
		DatabaseProxy admin = new DatabaseProxy("Admin","Admin@123");
		admin.execute("DELETE");
		
		DatabaseProxy nonadmin = new DatabaseProxy("Non-Admin","Admin@123");
		nonadmin.execute("DELETE");
	}

}

interface  DatabaseExecutor{
	public  void execute(String Query) throws Exception;
}
class DatabaseExecutorImpl implements DatabaseExecutor{
	@Override
	public void execute(String query) {
		System.out.println("Executing delete query....."+query);
	}
}
class DatabaseProxy implements DatabaseExecutor{

	boolean ifAdmin;
	DatabaseExecutorImpl dbExecutor;
	
	@Override
	public void execute(String query) throws Exception {
		if(ifAdmin) {
			dbExecutor.execute(query);
		}else {
			if(query.equals("DELETE"))
				throw new Exception("Delete query is not allowed for non-admin users");
			else
				dbExecutor.execute(query);
		}
	}
	public DatabaseProxy(String userName , String password) {
		if(userName == "Admin" && password == "Admin@123") {
			ifAdmin = true;
			dbExecutor = new DatabaseExecutorImpl();
		}
	}
}