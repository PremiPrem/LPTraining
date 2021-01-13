/**
 * 
 */

/**
 * @author tharu
 *
 */
public class SinletonPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DBManagerLogging dbManager=DBManagerLogging.getDBManagerLogging();
		System.out.println(dbManager);
		// TODO Auto-generated method stub
		
		DBManagerLogging dbManager2 =DBManagerLogging.getDBManagerLogging();
		System.out.println(dbManager2);

	}

}
