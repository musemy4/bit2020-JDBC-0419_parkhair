package miniProj_0417.db.resource;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import miniProj_0417.db.controller.*;
import miniProj_0417.db.model.DAO;
import miniProj_0417.db.view.*;


public interface R {
	DAO dao = DAO.getInstance();
	Vector member=dao.getInfo(IdxSet.idxset);
	
	//listVeiw
	JTextArea text = new JTextArea(22,30);
	
	
	
	//inputview
	JTextField tf_pay = new JTextField(15);
	JTextField tf_point = new JTextField(15);
	JTextField tf_usepoint = new JTextField(15);
	
	//가격표 없는거
	String[] designerselect = new String[] {"선택","가위손","울버린","제시카","원장"};
	String[] menuselect = new String[] {"선택","컷트","염색","펌/매직"};
	String[] serviceselect = new String[] {"안함","크리닉","헤드스파"};
	String[] itemselect = new String[] {"안함","박원장의 머리조언","묭실전용 샴푸","묭실전용 헤어팩", "묭실전용 고데기","제시카의 14k가위"};
	
	//가격표있는거
	String[] designerstr = new String[] {"선택","가위손","울버린 +3","제시카 +5","원장 +5"};
	String[] menustr = new String[] {"선택","컷트 +2.5 ","염색 +5","펌/매직 +7"};
	String[] servicestr = new String[] {"안함","크리닉 +3","헤드스파 +5"};
	String[] itemstr = new String[] {"안함","박원장의 머리조언","묭실전용 샴푸+2","묭실전용 헤어팩+4", "묭실전용 고데기+5","제시카의 14k가위+30"};
	
	
	JComboBox<String> designers = new JComboBox(designerstr);
	JComboBox<String> menus = new JComboBox(menustr);
	JComboBox<String> services = new JComboBox(servicestr);
	JComboBox<String> items = new JComboBox(itemstr);
	
	
	
	//Controller
	PayController payController = new PayController();
	PointController pointController = new PointController();
	ResetController resetController = new ResetController();
	ListController listController = new ListController();
	
	//view
	TitleView titleView = new TitleView();
	InputView inputView = new InputView();
	ListView listView = new ListView();
	
	//날짜
	Date now2 = new Date();
	SpinnerDateModel model3 = new SpinnerDateModel(now2, null, now2,Calendar.DAY_OF_WEEK);
	
	JSpinner spinner3 = new JSpinner(model3);
	DateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
	JSpinner.DateEditor editor3 = new JSpinner.DateEditor(spinner3,"yyyy-MM-dd");
	JFormattedTextField payspin = editor3.getTextField();
	
	
	
	
	
	
	
	
}