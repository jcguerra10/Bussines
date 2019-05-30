package model;
//
import java.util.*;
//
public abstract class ServiceCompany extends Company{
    protected String[][] polls;
    //
    public ServiceCompany(String name, String nit, String address, String phone, int employees, double valueAseets, String constitutionDate, char type, String legalRepresentative){
        super(name, nit, address, phone, employees, valueAseets, constitutionDate, type, legalRepresentative);
        //
        polls = new String[50][3];
    }

    public void addPoll(String a, String b, String c){
        for (int i=0;i<polls[0].length;i++) {
            if (polls[i][0] == null) {
                polls[i][0] = a;
                polls[i][1] = b;
                polls[i][2] = c;
            }
        }
    }
}
