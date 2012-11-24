package gr.manousos.bean;

import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class E2Bean { // extends Property {
	private static ArrayList<Property> propList = new ArrayList<Property>();
	private String location;
	private String point;
	private String usage;
	private float area;
	private boolean editable;

	// private ArrayList<Property> _propList = new ArrayList<Property>(
	// Arrays.asList(new Property("TRIOVASALOS", "my point", "Home", 95)));

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

	public E2Bean() {
		// propList.add(new Property("TRIOVASALOS", "my point", "Home", 45));
	}

	public E2Bean(String _location, String _point, String _usage, float _area) {

	}

	public ArrayList<Property> getPropList() {
		return propList;
	}

//	public void setPropList(ArrayList<Property> propList) {
//		this.propList = propList;
//	}

	// public E2Bean() {
	// super("PERA TRIOVASALOS", "my point", "Home", 55);
	//
	// }

	// public E2Bean(ArrayList<Property> _pList) {
	//
	// _pList.add(new Property("PERA TRIOVASALOS", "my point", "Home", 75));
	// this.propList = _pList;
	// }

	// public ArrayList<Property> getProlList() {
	// return _propList;
	// }

	public String saveAction() {
		//System.out.write(1111111);
		Property p = new Property(this.location, this.point, this.usage,
				this.area);
		// p.setArea(getArea());
		// p.setLocation(getLocation());
		// p.setPoint(getPoint());
		// p.setUsage(getUsage());

		propList.add(p);
		// get all existing value but set "editable" to false
		// for (Property prop : propList) {
		// prop.setEditable(false);
		// }
		// return to current page
		return null;

	}

	public String editAction(Property property) {

		property.setEditable(true);
		return null;
	}
}
