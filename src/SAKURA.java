public class SAKURA {
    private String specie;
    SAKURA (String specie) {
        this.specie = specie;
    }
    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    @Override
    public String toString() {
        return "SAKURA{specie='"+specie+"'}";
    }
}
