package swingMvc_h2.proj0416_20.model;

public class DAO {
	//�̱���
	private DAO() {}

	private static DAO instance;
	
	public static DAO getInstance() {
		if(instance==null)
		instance=new DAO();
		
		return instance;
	}

	
	
	
	


}
