class Servico extends Item {
    private int horasDeReparo;
    public Servico(String codigo, String descricao, double valor, int horasDeReparo) {
        super(codigo, descricao, valor);
        this.horasDeReparo = horasDeReparo;
    }
    public int getHorasDeReparo() {
        return horasDeReparo;
    }
}