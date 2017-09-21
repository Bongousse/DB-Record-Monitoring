package db.record.monitoring.ui.loglist;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.UIManager;

@SuppressWarnings({ "serial", "rawtypes" })
public class LogListRenderer extends DefaultListCellRenderer {
	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {

		LogListItem logItem = (LogListItem) value;
		setFont(list.getFont());
		setBackground(list.getBackground());
		setForeground(list.getForeground());

		if (isSelected) {
			setBackground(UIManager.getColor("Panel.background"));
		}

		setText(logItem.getType() + "       " + logItem.getTableName() + "       " + logItem.getDate());

		return this;
	}
}
