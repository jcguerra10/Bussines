package model;
//

public class Sanitation {

    public static final String ROOM_TEMPERATURE = "Temperatura ambiente";
    public static final String REFRIGERATION = "Refrigeration";
    public static final String FREEZING = "Congelacion";
    //
    private boolean imported;
    private String importer;
    private String conservation;

    //
    /**
     *
     * @param imported
     * @param importer
     * @param conservation
     */
    public Sanitation(boolean imported, String importer, String conservation) {
        this.imported = imported;
        this.importer = importer;
        this.conservation = conservation;
    }

    /**
     *
     * @return
     */
    public boolean isImported() {
        return imported;
    }

    /**
     *
     * @param imported
     */
    public void setImported(boolean imported) {
        this.imported = imported;
    }

    /**
     *
     * @return
     */
    public String getImporter() {
        return importer;
    }

    /**
     *
     * @param importer
     */
    public void setImporter(String importer) {
        this.importer = importer;
    }

    /**
     *
     * @return
     */
    public String getConservation() {
        return conservation;
    }

    /**
     *
     * @param conservation
     */
    public void setConservation(String conservation) {
        this.conservation = conservation;
    }
}
