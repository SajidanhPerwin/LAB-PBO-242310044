package quizz_1;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class DataBuku {
    public static void main(String[] args) {
        ArrayList<String> buku = new ArrayList<>();
        String menu;

        do {
            menu = JOptionPane.showInputDialog(
                "MENU DATA BUKU\n" +
                "1. Masukkan Judul Buku\n" +
                "2. Hapus Buku\n" +
                "3. Output Seluruh Data Buku\n" +
                "4. Keluar\n\n" +
                "Pilih menu:"
            );

            if (menu == null) break;

            switch (menu) {
                case "1":
                    String judul = JOptionPane.showInputDialog(
                        "Masukkan judul buku:"
                    );
                    if (judul != null && !judul.trim().isEmpty()) {
                        buku.add(judul);
                        JOptionPane.showMessageDialog(
                            null, "Buku berhasil disimpan!"
                        );
                    }
                    break;

                case "2":
                    if (buku.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null, "Data buku masih kosong!"
                        );
                        break;
                    }

                    String indeks = JOptionPane.showInputDialog(
                        "Data buku:\n" + tampilkan(buku) +
                        "\nMasukkan indeks buku (0-" +
                        (buku.size() - 1) + "):"
                    );

                    try {
                        int i = Integer.parseInt(indeks);
                        if (i >= 0 && i < buku.size()) {
                            buku.remove(i);
                            JOptionPane.showMessageDialog(
                                null, "Buku berhasil dihapus!"
                            );
                        } else {
                            JOptionPane.showMessageDialog(
                                null, "Indeks tidak valid!"
                            );
                        }
                    } catch (Exception e) {
                        if (indeks != null)
                            JOptionPane.showMessageDialog(
                                null, "Masukkan indeks berupa angka!"
                            );
                    }
                    break;

                case "3":
                    JOptionPane.showMessageDialog(
                        null, buku.isEmpty()
                        ? "Data buku masih kosong!"
                        : tampilkan(buku)
                    );
                    break;

                case "4":
                    JOptionPane.showMessageDialog(
                        null, "Program selesai."
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                        null, "Pilihan tidak valid!"
                    );
            }
        } while (!"4".equals(menu));
    }

    static String tampilkan(ArrayList<String> buku) {
        String hasil = "";
        for (int i = 0; i < buku.size(); i++) {
            hasil += i + ". " + buku.get(i) + "\n";
        }
        return hasil;
    }
}