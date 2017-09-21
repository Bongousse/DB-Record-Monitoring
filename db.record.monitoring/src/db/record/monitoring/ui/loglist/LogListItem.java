package db.record.monitoring.ui.loglist;

public class LogListItem {
	private String type;
	private String tableName;
	private String date;

	public LogListItem(String type, String tableName, String date) {
		this.type = type;
		this.tableName = tableName;
		this.date = date;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LogListItem [type=");
		builder.append(type);
		builder.append(", tableName=");
		builder.append(tableName);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
