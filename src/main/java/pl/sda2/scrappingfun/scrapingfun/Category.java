package pl.sda2.scrappingfun.scrapingfun;

public enum Category {

    PLANT("Roślina doniczkowa"),
    FLOWER("Kwiat");


    private String label;

    Category(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
