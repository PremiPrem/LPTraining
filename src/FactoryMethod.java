
public class FactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Package aPackage =PackageFactory.createPackage(PackageCode.BASIC);
            System.out.println(aPackage);
            Package aPackage1 =PackageFactory.createPackage(PackageCode.PLATINUM);
            System.out.println(aPackage1);    
	}

}
