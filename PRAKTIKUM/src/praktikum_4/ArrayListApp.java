package praktikum_4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListApp {
	 public static void main(String[] args) {
		 ArrayList<String> nama = new ArrayList<String>();
		 nama.add("Rafly"); // input data
		 System.out.println(nama.get(0));
		 
		 // input dari user menggunakan jop
		 JOptionPane Jop = new JOptionPane();
		 nama.add(Jop.showInputDialog(null, "input nama:"));
		 Jop.showMessageDialog(null, "nama: "+ nama.getLast());
		 
		 nama.remove(0); //menghapus
		 System.out.println("Nama setelah di hapus: " + nama.get(0));
		 
		 //pertanyaan
		 System.out.println(nama.get(1));
		 
		 nama.add("Ade");
		 nama.add("Louren");
		 System.out.println("List Nama: ");
		 for (int i = 0; i < nama.size(); i++) {
			 System.out.println(nama.get(i));
		 }
		 
		 nama.clear();
		 System.out.println(nama);
	 }
}
