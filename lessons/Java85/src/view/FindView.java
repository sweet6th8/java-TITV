package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.FindListener;
import model.FindModel;

public class FindView extends JFrame {
	private FindModel findModel;
	private JLabel jLabel_vanban, jLabel_tukhoa, jLabel_ketQua;
	private JTextArea jTextArea_vanban;
	private JTextField jTextField_tukhoa;

	public FindView() throws HeadlessException {
		this.findModel = new FindModel();
		this.init();

	}

	private void init() {

		this.setTitle("Find");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.BOLD, 40);
	
		
		//center
		jLabel_vanban= new JLabel("Van ban");
		jLabel_vanban.setFont(font);
		jTextArea_vanban= new JTextArea(100, 100);//dong va cot
		jTextArea_vanban.setFont(font);
		
		
		//footer
		FindListener findListener = new FindListener(this);
		
		jLabel_tukhoa= new JLabel("Tu khoa");
		jLabel_tukhoa.setFont(font);
	
		jTextField_tukhoa = new JTextField();
		jTextField_tukhoa.setFont(font);
		
		
		JPanel jPanel_center = new JPanel();
		jPanel_center.setLayout(new GridLayout(2,1,10,10));
		jPanel_center.add(jLabel_vanban);
		jPanel_center.add(jTextArea_vanban);
		
		
		JButton jbt_thongKe = new JButton("Thong ke");
		jbt_thongKe.setFont(font);
		jbt_thongKe.addActionListener(findListener);
		jLabel_ketQua= new JLabel("");
		jLabel_ketQua.setOpaque(true);
		jLabel_ketQua.setFont(font);
		jLabel_ketQua.setBackground(Color.pink);
		
		JPanel jPanel_footer = new JPanel();
		jPanel_footer.setLayout(new GridLayout(2,1,10,10));
	
		jPanel_footer.add(jLabel_tukhoa);
		jPanel_footer.add(jTextField_tukhoa);
		jPanel_footer.add(jbt_thongKe);
		jPanel_footer.add(jLabel_ketQua);
		
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_center,BorderLayout.CENTER);
		this.add(jPanel_footer,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
public void find() {
	this.findModel.setVanBan(jTextArea_vanban.getText());
	this.findModel.setTuKhoa(jTextField_tukhoa.getText());
	this.findModel.find();
	this.jLabel_ketQua.setText(this.findModel.getKetQua());
}
}
