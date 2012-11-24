package gr.manousos.bean;

public class Property {
	private String location;
	private String point;
	private String usage;
	private float area;
	private boolean editable;

	public Property(String _location, String _point, String _usage, float _area) {
		this.area = _area;
		this.location = _location;
		this.point = _point;
		this.usage = _usage;
	}

	public Property() {
		// TODO Auto-generated constructor stub
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

}
