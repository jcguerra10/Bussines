package model;
//

public class Invima {

    public static final char MANUFACTURE_EXPORT = 'A';
    public static final char MANUFACTURE_SELL = 'B';
    public static final char IMPORT_SELL = 'C';
    //
    private String sanitaryRegistration;
    private String status;
    private String expiration;
    private char modality;

    //
    /**
     *
     * @param sanitaryRegistration
     * @param status
     * @param expiration
     * @param modality
     */
    public Invima(String sanitaryRegistration, String status, String expiration, char modality) {
        this.sanitaryRegistration = sanitaryRegistration;
        this.status = status;
        this.expiration = expiration;
        this.modality = modality;
    }

    //
    /**
     *
     * @param waterA
     * @return
     */
    public int waterxtrees(double waterA) {
        int trees = 0;
        //
        if (waterA >= 1 && waterA <= 140) {
            trees = 6;
        } else if (waterA >= 141 & waterA <= 800) {
            trees = 25;
        } else if (waterA >= 800) {
            trees = 800;
        }
        return trees;
    }

    /**
     *
     * @return
     */
    public String toString() {
        String msg = "";
        msg += "El registro sanitario: " + sanitaryRegistration + "\n";
        msg += "El estado: " + status + "\n";
        msg += "Expiracion: " + expiration + "\n";
        msg += "Modalidad: " + modality + "\n";
        return msg;
    }

}
