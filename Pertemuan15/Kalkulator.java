package Pertemuan15;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    private JTextField field1;
    private JTextField field2;
    private JButton buttonJumlah;
    private JButton buttonKurang;

    public Kalkulator() {
        // Inisialisasi komponen GUI
        field1 = new JTextField();
        field2 = new JTextField();
        buttonJumlah = new JButton("Jumlah");
        buttonKurang = new JButton("Kurang");

        // Menambahkan ActionListener ke tombol
        buttonJumlah.addActionListener(this);
        buttonKurang.addActionListener(this);

        // Set layout dengan 3 baris, 1 kolom
        setLayout(new GridLayout(4, 1));

        // Menambahkan komponen ke JFrame
        add(field1);
        add(field2);
        add(buttonJumlah);
        add(buttonKurang);

        setTitle("Kalkulator Sederhana");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Mengambil nilai dari text field
            int angka1 = Integer.parseInt(field1.getText());
            int angka2 = Integer.parseInt(field2.getText());

            // Menghitung hasil penjumlahan
            int hasil = angka1 + angka2;
            // Jika tombol yang ditekan adalah buttonKurang, lakukan pengurangan
            if (e.getSource() == buttonKurang) {
                hasil = angka1 - angka2;
            }

            // Menampilkan hasil dalam dialog box
            JOptionPane.showMessageDialog(this, "Hasil: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}