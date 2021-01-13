/**
 * 
 */

/**
 * @author tharu
 *
 */
public class DBManager {

	private static volatile DBManager dbManager=new DBManager();
	private DBManager() {
		
	}
	
//	can't create instance -private constructor
	public static DBManager getDBManager() {
		return dbManager;
	}

}
