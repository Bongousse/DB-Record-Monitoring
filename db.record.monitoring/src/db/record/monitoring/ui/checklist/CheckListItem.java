package db.record.monitoring.ui.checklist;

public class CheckListItem {
	private String label;
	private boolean isSelected;

	public CheckListItem(String label) {
		this.label = label;
		isSelected = false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CheckListItem [label=");
		builder.append(label);
		builder.append(", isSelected=");
		builder.append(isSelected);
		builder.append("]");
		return builder.toString();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
}
