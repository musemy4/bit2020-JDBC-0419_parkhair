package miniProj_0417.member.resource;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;

import miniProj_0417.member.controller.*;
import miniProj_0417.member.model.DAO;

public interface R {
	JTextField tf_name = new JTextField(10);
	JTextField tf_phone = new JTextField(10);
	
	ButtonGroup g = new ButtonGroup();
	JRadioButton rb_m = new JRadioButton("Male");
	JRadioButton rb_f = new JRadioButton("Female");
	
	
	//calView
	Date now = new Date();
	final SpinnerDateModel model = new SpinnerDateModel(now, null, now,Calendar.DAY_OF_WEEK);
	final SpinnerDateModel model2 = new SpinnerDateModel(now, null, now,Calendar.DAY_OF_WEEK);
	
	JSpinner spinner = new JSpinner(model);
	JSpinner spinner2 = new JSpinner(model2);
	final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	final DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
	
	JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner,"yyyy-MM-dd");
	JSpinner.DateEditor editor2 = new JSpinner.DateEditor(spinner,"yyyy-MM-dd");
	JFormattedTextField birthspin = editor.getTextField();
	JFormattedTextField joinspin = editor2.getTextField();
	
	
	
	//Controller
	ResetController resetController = new ResetController();
	JoinController joinController = new JoinController();
	
	DAO dao = DAO.getInstance();
	int memberSize = dao.getMemberSize();
	
}
