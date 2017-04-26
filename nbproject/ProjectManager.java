package Tugas;

public class ProjectManager extends Employee {

    private int tunjangan = 6000000;
    private int bonus = 450000;

    public ProjectManager(int lamaKerja) {
        super(lamaKerja);
    }

    public int getBonusApresiasi() {
        if (super.getLamaKerja() >= 10) {
            return 700000;
        } else {
            return 450000 / 2;
        }
    }

    public int getTotalGaji() {
        return super.getGajiPokok() + tunjangan + bonus + getBonusApresiasi();
    }

    public String toString() {
        return String.format("Total Gaji Project Manager : Rp. %d", (getTotalGaji() + super.getBonus()));
    }

}
