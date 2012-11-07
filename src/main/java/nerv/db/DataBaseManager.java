package main.java.nerv.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.LinkedList;
import java.util.Queue;

import main.java.nerv.tools.StaticResourcesManager;

public abstract class DataBaseManager {

	public static Queue<Connection> pool = null;
    
	static {
		
		/*init pool*/
		pool = new LinkedList<Connection>();
		for(int index =0;index<Integer.parseInt(
				StaticResourcesManager.getResources("poolNumber").toString());
				index++){
			Connection connection = getInitConn();
			pool.offer(connection);
		}
	}

	public static Connection getConnection() {
       
		if (pool.size() > 0) {
			return pool.poll();
		} else {
			Connection connection = getInitConn();
			return connection;
		}
	}
	
	public static void releaseConnection(Connection conn){
		pool.offer(conn);
	}
	
	public static Connection getInitConn(){
		Connection connection = null;
		try {
			Class.forName(StaticResourcesManager.getResources("className"));
			connection = DriverManager.getConnection(
					StaticResourcesManager.getResources("url"),
					StaticResourcesManager.getResources("username"),
					StaticResourcesManager.getResources("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
