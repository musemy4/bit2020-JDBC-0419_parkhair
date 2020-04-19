package miniProj_0417.entrance.resource;

import javax.swing.*;

import miniProj_0417.entrance.controller.*;
import miniProj_0417.entrance.model.DAO;

public interface R {
	JTextField tf_name = new JTextField(10);
	JTextField tf_pw = new JTextField(10);
	JCheckBox admincheck = new JCheckBox("관리자");
	
	JButton newB = new JButton("new");
	JButton memberB = new JButton("member");
	JButton resetB = new JButton("reset");
	JButton adminB = new JButton("admin");
	
	//Controller
	ResetController resetController = new ResetController();
	JoinController joinController = new JoinController();
	MemberController memberController = new MemberController();
	AdminController adminController = new AdminController();

	
	DAO dao = DAO.getInstance();
}