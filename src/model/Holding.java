package model;
//
import java.util.*;
//
public class Holding{
    private ArrayList<Company> companys;
    private Cubicule[][] cubicules;
    //
    public Holding(){
        companys = new ArrayList<Company>();
        cubicules = new Cubicule[][];
    }
    //
    public void addCompany(Company newCompany){
        companys.add(newCompany);
    }

    public String showInfo(){
        String msg = "";
        if (companys!=null) {
            for (int i=0;i<companys.size();i++) {
                msg+=companys.get(i);
            }
        }
        return msg;
    }

    public String shortInfo(){
        String msg = "";
        if (companys!=null) {
            for (int i=0;i<companys.size();i++) {
                if (companys.get(i) instanceof ServiceCompany) {
                    msg += i+") "+companys.get(i).getName()+"\n";
                }
            }
        }
        return msg;
    }
    public void addPoll(int index, String a, String b, String c){
        companys.get(index).addPoll(a, b, c);
    }
}
