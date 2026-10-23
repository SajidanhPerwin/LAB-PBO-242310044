package praktikum_1;

public class Introduction {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// variabel
		int angka1 = 10;
		int angka2 = 20;
		
		//tipe data
		String nama = "Sajidah Perwin";
		
		//operator 
		int hasilTambah = angka1 = angka2; //pertambahan
		hasilTambah++; //increment
		
		// operator perbandingan 
		boolean pembanding = angka1 > angka2;
		boolean tesNama = nama == "Sajidah Perwin";
		
		
		//operator kondisional
		boolean kondisional =(true || false) && (true && true);
		
		
		//operator assignment
		angka1 *= angka2; //angka1 dikali angka2
						  // hasilnya disimpan di angka1
		
		Dog mydog = new Dog();
		mydog.hungry();
		String name = "Sajidah Perwin";
		mydog.puppyName(name);
	}
}
