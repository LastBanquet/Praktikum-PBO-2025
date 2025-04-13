package universitas;

public class Mahasiswa {
    String nim;
    String nama;
    String programStudi;
    Double ipk;

    public Mahasiswa(String NIM, String Nama, String programStudi, Double IPK) {
        this.nim = NIM;
        this.nama = Nama;
        this.programStudi = programStudi;
        this.ipk = IPK;
    }

    public String getNIM() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getProgramStudi() {
        return programStudi;
    }
    public Double getIpk() {
        return ipk;
    }

    public void tampilkanData() {
        System.out.println("---Data Mahasiswa---");
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Program Studi: " + programStudi);
        System.out.println("IPK          : " + ipk);
        System.out.println("--------------------");
    }
}
