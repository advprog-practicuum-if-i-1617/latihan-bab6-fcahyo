package Tugas;

public class SoftwareEngineering extends Employee {

    private int tunjangan = 5500000;
    private int bonus = 300000;

    public SoftwareEngineering(int lamaKerja) {
        super(lamaKerja);
    }

    public int getTotalGaji() {
        return super.getGajiPokok() + tunjangan + bonus;
    }

    @Override
    public String toString() {
        return String.format("Total Gaji Software Engineer : Rp. %d", (getTotalGaji()) + super.getBonus());
    }
}
