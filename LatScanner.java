import java.util.*;
public class LatScanner{
 public static void main(String[]args)
 {
 String nama,gol,pend;
 int hnr_ttp=300000;
 double jml_krj,tunjab,tunpend,hnr_lbr,hnr_ttl;
 Scanner input=new Scanner(System.in);
 System.out.print("\n");
 System.out.println("Program hitung honor karyawan kontrak");
 System.out.println(" PT Dingin Damai");
 System.out.println("-------------------------------------");
System.out.print("\n");
System.out.print("Nama karyawan : ");nama=input.nextLine();
System.out.print("Golongan [1|2|3] : ");gol=input.nextLine();
System.out.print("Pendidikan [SMU|D3|S1] : ");pend=input.nextLine();
System.out.print("Jumlah jam kerja : ");jml_krj=input.nextInt();
if (gol=="1")tunjab=0.05*hnr_ttp;
else if (gol=="2")tunjab=0.1*hnr_ttp;
else tunjab=0.15*hnr_ttp;
if (pend=="SMU"||pend=="smu")tunpend=0.025*hnr_ttp;
else if (pend=="D3"||pend=="d3")tunpend=0.05*hnr_ttp;
else tunpend=0.075*hnr_ttp;
if (jml_krj>=0 && jml_krj==8)hnr_lbr=0;
else hnr_lbr=(jml_krj-8)*2500;
System.out.println("-------------------------------------");
System.out.print("\n");
System.out.println("Karyawan yang bernama "+nama);
System.out.println("Honor yang diterima : ");
System.out.println("Honor tetap = Rp. "+(int)hnr_ttp);
System.out.println("Tunjangan jabatan = Rp. "+(int)tunjab);
System.out.println("Tunjangan pendidikan = Rp. "+(int)tunpend);
System.out.println("Honor lembur = Rp. "+(int)hnr_lbr);
System.out.println("----------------------------------------");
hnr_ttl=hnr_ttp+tunjab+tunpend+hnr_lbr;
System.out.println("Honor yang diterima = Rp. "+(int)hnr_ttl);
 }
}