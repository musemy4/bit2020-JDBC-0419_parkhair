package miniProj_0417.admin.resource;

import java.io.ObjectInputStream.GetField;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import miniProj_0417.admin.controller.*;
import miniProj_0417.admin.model.DAO;
import miniProj_0417.admin.view.*;

public interface R {
	String[] table=new String[] {};
	String[] memNames 
	= new String[] {"회원번호","성함","성별","연락처","생일","누적포인트","가용포인트","등급","가입일"};
	String[] servNames 
	= new String[] {"회원번호","성함","서비스날짜","담당쌤","메뉴","서비스","etc","사용포인트","금액","적립포인트"};
	
	DefaultTableModel mdm= new DefaultTableModel(memNames,0);
	DefaultTableModel sdm= new DefaultTableModel(servNames,0);
	
	
	TitleView titleView = new TitleView();
	ButtonView buttonView = new ButtonView();
	MListView mlistView = new MListView(mdm);
	SListView slistView = new SListView(sdm);
	
	
	
	//controller
	MListController mlistController = new MListController();
	SListController slistController = new SListController();
	ServicebackController sbackController = new ServicebackController();
	DeleteController deleteController=new DeleteController();
	ModifyController modifyController=new ModifyController();
	SearchController searchController= new SearchController();
	
	DAO dao=DAO.getInstance(); 

}
