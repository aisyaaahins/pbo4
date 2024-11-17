class Produk {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    public Produk(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public String displayInfo() {
        return "Kode: " + kodeBarang + ", Nama:" + namaBarang + ", Harga:" + hargaBarang;
    }
}