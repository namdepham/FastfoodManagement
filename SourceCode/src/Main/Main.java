package Main;

import QuanLyFastFood.DAO.MyConnect;
import QuanLyFastFood.GUI.DangNhapGUI;

public class Main {

    public static void main(String[] args) {
        new MyConnect();

        changLNF("Nimbus");
        //thay đổi look and feel. giao dien ung dung
        // thành công tất cả component đều sử dụng
        // faild sử dụng Look and Fell Default
        DangNhapGUI login = new DangNhapGUI();
        login.showWindow();
    }

    public static void changLNF(String nameLNF) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (nameLNF.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
    }
}
