class Peca extends Item {
    private String brand;
    private String unidade;
    public Peca(String code, String description, double value, String brand, String unidade) {
        super(code, description, value);
        this.brand = brand;
        this.unidade = unidade;
    }
    public String getBrand() {
        return brand;
    }
    public String getunidade() {
        return unidade;
    }
}
