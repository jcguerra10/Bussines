package model;
//
import java.util.*;
//
public class Company{
    public static final char AGRI_SILVI_HUNT_FIDH = 'A';
    public static final char EXPLO_MINES_QUARRIES = 'B';
    public static final char MANUFACTURING = 'C';
    public static final char ELEC_GAS_STEAM = 'D';
    public static final char CONSTRUCTION = 'E';
    public static final char COMMERCE_MM = 'F';
    public static final char TRANS_STORAGE = 'G';
    public static final char EST_INSU_ESTATE_SERV = 'H';
    public static final char SOCIAL_COMUNALS = 'I';
    //
    protected String name;
    protected String nit;
    protected String address;
    protected String phone;
    protected int employees;
    protected double valueAseets;
    protected String constitutionDate;
    protected char type;
    protected String legalRepresentative;
    //
    protected Cubicle[][] cubicules;
    //
	public Company(String name, String nit, String address, String phone, int employees, double valueAseets, String constitutionDate, char type, String legalRepresentative) {
		this.name = name;
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.employees = employees;
		this.valueAseets = valueAseets;
		this.constitutionDate = constitutionDate;
		this.type = type;
		this.legalRepresentative = legalRepresentative;
	}
    //
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public double getValueAseets() {
		return valueAseets;
	}

	public void setValueAseets(double valueAseets) {
		this.valueAseets = valueAseets;
	}

	public String getConstitutionDate() {
		return constitutionDate;
	}

	public void setConstitutionDate(String constitutionDate) {
		this.constitutionDate = constitutionDate;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getLegalRepresentative() {
		return legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}
    //

    public void addBuilding(int floors){
        cubicules = new Cubicle[floors][20];
        int k=0;
        for (int i=0;i<cubicules.length;i++) {
            k=0;
            for (k=0;k<cubicules[0].length;k++) {
                Cubicle newCubicle = new Cubicle(null, null, null, null);
                cubicules[i][k] = newCubicle;
                int n = (int)(Math.random() * 10000) + 1;
                String w = "E-"+n;
                cubicules[i][k].setExtension(w);
            }

        }
    }

    public String searchWithType(char type){
        String msg = "";
        if (type == 'L') {
            for (int i=0;i<cubicules.length;i++) {
                msg += cubicules[i][0].getExtension()+"\n";
            }
            msg += "\n";
            for (int k=0;k<cubicules[0].length;k++) {
                int length = cubicules.length-1;
                msg += cubicules[length][k].getExtension()+"\n";
            }
        }
        else if (type == 'Z') {
            for (int i=0;i<cubicules[0].length;i++ ) {
                msg += cubicules[0][i].getExtension()+"\n";
            }
            msg += "\n";
            boolean exit = false;
            int a = 0;
            int b = cubicules[0].length-1;
            while (!exit) {
                msg += cubicules[a][b].getExtension() + "\n";
                ++a;
                --b;
                if (a>=cubicules.length) {
                    exit = true;
                }
                if (b<=0) {
                    exit = true;
                }
            }
            msg += "\n";
            for (int k=0;k<cubicules[0].length;k++) {
                int length = cubicules.length-1;
                msg += cubicules[length][k].getExtension()+"\n";
            }
        }
        else if (type == 'X') {
            boolean exit = false;
            for (int i=0;!exit;i++) {
                if (i<cubicules.length && i<cubicules[0].length) {
                    msg += cubicules[i][i].getExtension() + "\n";
                }else if (i>=cubicules.length || i>=cubicules[0].length ) {
                    exit = true;
                }
            }
            msg += "\n";
            int a = 0;
            int b = cubicules[0].length-1;
            exit = false;
            while (!exit) {
                msg += cubicules[a][b].getExtension() + "\n";
                ++a;
                --b;
                if (a==cubicules.length) {
                    exit = true;
                }
                if (b==0) {
                    exit = true;
                }
            }
        }
        else if (type == 'O') {
            for (int i=0;i<cubicules[0].length;i++ ) {
                msg += cubicules[0][i].getExtension()+"\n";
            }
            msg += "\n";
            for (int i=0;i<cubicules.length;i++) {
                msg += cubicules[i][cubicules[0].length-1].getExtension()+"\n";
            }
            msg += "\n";
            for (int i=0;i<cubicules.length;i++) {
                msg += cubicules[i][0].getExtension()+"\n";
            }
            msg += "\n";
            for (int k=0;k<cubicules[0].length;k++) {
                int length = cubicules.length-1;
                msg += cubicules[length][k].getExtension()+"\n";
            }
        }
        else if (type == 'E') {
            boolean exit = false;
            int i=0;
            int f = 0;
            int k = 0;
            while (!exit) {
                if (cubicules.length%2 != 0) {
                    if (f<cubicules.length) {
                        for (i=0;i<cubicules[0].length;i++) {
                            msg += cubicules[f][i].getExtension()+"\n";
                        }
                        msg += "\n";
                    }else {
                        exit = true;
                    }
                    f = f+1;
                    if (f<cubicules.length) {
                        for (k=cubicules[0].length-1;k>0;k--) {
                            msg += cubicules[f][k].getExtension()+"\n";
                        }
                        msg += "\n";
                    }else{
                        exit = true;
                    }
                    f = f+1;
                }else{
                    msg += "No es posible ya que el numero de pisos es par";
                    exit = true;
                }
            }
        }
        return msg;
    }

    public String getSpiralEmails(){
        String msg = "";
        for (int i=0;i<cubicules[0].length;i++) {

        }
        return msg;
    }


}
