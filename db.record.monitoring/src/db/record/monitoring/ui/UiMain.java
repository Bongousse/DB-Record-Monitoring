package db.record.monitoring.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import db.record.monitoring.ui.checklist.CheckListItem;
import db.record.monitoring.ui.checklist.CheckListRenderer;
import db.record.monitoring.ui.loglist.LogListItem;
import db.record.monitoring.ui.loglist.LogListRenderer;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class UiMain extends JFrame {
	private static final long serialVersionUID = 1900510630712944021L;

	JButton jbtNorth = new JButton("North");
	JButton jbtWest = new JButton("West");
	JButton jbtCenter = new JButton("Center");
	JButton jbtEast = new JButton("East");
	JButton jbtSouth = new JButton("South");

	JList tableList = new JList<>();

	public UiMain() {
		getContentPane().setLayout(new GridLayout(2, 1));

		JPanel northPanel = new JPanel(new GridBagLayout());
		JPanel southPanel = new JPanel(new GridBagLayout());

		JList list = new JList(new CheckListItem[] { new CheckListItem("apple"), new CheckListItem("orange"),
				new CheckListItem("mango"), new CheckListItem("mango"), new CheckListItem("mango"),
				new CheckListItem("mango"), new CheckListItem("mango"), new CheckListItem("mango"),
				new CheckListItem("mango"), new CheckListItem("mango"), new CheckListItem("mango"),

				new CheckListItem("paw paw"), new CheckListItem("banana") });
		list.setCellRenderer(new CheckListRenderer());
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				JList list = (JList) event.getSource();
				int index = list.locationToIndex(event.getPoint());// Get index
																	// of item
																	// clicked
				CheckListItem item = (CheckListItem) list.getModel().getElementAt(index);
				item.setSelected(!item.isSelected()); // Toggle selected state
				list.repaint(list.getCellBounds(index, index));// Repaint cell
			}
		});

		JList logList = new JList(
				new LogListItem[] { new LogListItem("INSERT", "bxt_msg_test_info", "2017-09-16 23:23:05.131"),
						new LogListItem("DELETE", "bxt_msg_test_info", "2017-09-16 23:21:31.912") });
		logList.setCellRenderer(new LogListRenderer());
		logList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(10, 10, 10, 10);
		c.ipadx = 50;
		c.ipady = 50;
		c.weightx = 1.0;
		c.weighty = 1.0;
		northPanel.add(list, c);
		c.weightx = 2.0;
		northPanel.add(logList, c);

		southPanel.add(jbtSouth, c);

		add(northPanel);
		add(southPanel);

		this.setSize(1400, 900);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new UiMain();
	}
}
