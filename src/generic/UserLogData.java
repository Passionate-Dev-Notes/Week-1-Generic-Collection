package generic;

public class UserLogData {
	private String name;
	private String date;
	private String time;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public UserLogData(String name, String date, String time) {
		super();
		this.name = name;
		this.date = date;
		this.time = time;
	}
	@Override
	public String toString() {
		return "UserLogData [name=" + name + ", date=" + date + ", time=" + time + "]";
	}

}
