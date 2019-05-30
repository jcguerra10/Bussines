package model;
//
import java.util.*;
//
public class Cubicle{
    private String employees;
    private String charge;
    private String email;
    private String extension;
    //
	public Cubicle (String employees, String charge, String email, String extension) {
		this.employees = employees;
		this.charge = charge;
		this.email = email;
		this.extension = extension;
	}
    //
	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
}
