
public class DBManagerLogging {
	
	private static volatile DBManagerLogging dbManager; //new DBManager();
	private static volatile Connection connection;
	private DBManagerLogging() {
		if (dbManager !=null) {
			throw new RuntimeException("please use getDBManagerLogging method");
		}}
			
			
			public static DBManagerLogging getDBManagerLogging() {
				if (dbManager ==null) {
			synchronized (DBManager.class) {
				dbManager =new DBManagerLogging();
			}
		}
		return dbManager;
	} 
			public Connection getcConnection() {
				
			}

}
