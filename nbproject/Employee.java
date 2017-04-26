package Tugas;
public class Employee {
    
    private int gajiPokok;
    private int bonus;
    private int lamaKerja;    
    
    public Employee(int lamaKerja){
        this.gajiPokok = 2500000;
        this.lamaKerja = lamaKerja;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }
    
    public int getLamaKerja(){
        return lamaKerja;
    }
        
    public int getBonus() {
        if (lamaKerja >= 5) {
            return 500000 / 2;
        }
        else{
            return 0;
        }
    }
            
    public int getTotalGaji(){
        return getGajiPokok() + getBonus();
    }
    
    public String toString(){
        return String.format("Total gaji : Rp. %f",getTotalGaji());
    }
}