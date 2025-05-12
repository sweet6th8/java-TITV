package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleController;

public class MenuExampleView extends JFrame {
	private JLabel jLabel;
	private JPopupMenu jPopupMenu;

	public MenuExampleView() {
		this.setTitle("Draw Example");
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		// Tao controller
		MenuExampleController menuExampleController = new MenuExampleController(this);

		// tao menu
		JMenuBar jMenuBar = new JMenuBar();

		JMenu jMenu_file = new JMenu("File");
		JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		jMenuItem_new.addActionListener(menuExampleController);
		JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
		jMenuItem_open.addActionListener(menuExampleController);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
		jMenuItem_exit.addActionListener(menuExampleController);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);
		jMenu_file.add(jMenuItem_new);

		JMenu jMenu_help = new JMenu("Help");
		jMenu_help.setMnemonic(KeyEvent.VK_L);
		jMenu_help.setDisplayedMnemonicIndex(0);
		// Mnemonic là mặc định ALT còn Acceletor do người dùng chỉ định

		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		jMenuItem_welcome.addActionListener(menuExampleController);
		jMenu_help.add(jMenuItem_welcome);

		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);

		// Them menu
		this.setJMenuBar(jMenuBar);

		// Tao ToolBar (Thanh cong cu)
		JToolBar jToolBar = new JToolBar();
		JButton jButton_Undo = new JButton("Undo");
		jButton_Undo.setToolTipText("Nhan vao day de quay lai thao tac vua roi!");
		jButton_Undo.addActionListener(menuExampleController);
		JButton jButton_Redo = new JButton("Redo");
		jButton_Redo.setToolTipText("Nhan vao day de tien den thao tac tiep theo!");
		jButton_Redo.addActionListener(menuExampleController);
		JButton jButton_Copy = new JButton("Copy");
		jButton_Copy.setToolTipText("Nhan vao day de sao chep!");
		jButton_Copy.addActionListener(menuExampleController);
		JButton jButton_Cut = new JButton("Cut");
		jButton_Cut.setToolTipText("Nhan vao day de cat!");
		jButton_Cut.addActionListener(menuExampleController);
		JButton jButton_Paste = new JButton("Paste");
		jButton_Paste.setToolTipText("Nhan vao day de dan!");
		jButton_Paste.addActionListener(menuExampleController);
		jToolBar.add(jButton_Undo);
		jToolBar.add(jButton_Redo);
		jToolBar.add(jButton_Copy);
		jToolBar.add(jButton_Cut);
		jToolBar.add(jButton_Paste);

		this.add(jToolBar, BorderLayout.NORTH);
		

		
		// Tao label hien thi
		Font font = new Font("Arial", Font.BOLD, 40);
		jLabel = new JLabel();
		jLabel.setFont(font);

	
		this.add(jLabel, BorderLayout.CENTER);

		this.setVisible(true);

	}

	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}
}
