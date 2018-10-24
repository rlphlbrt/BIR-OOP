package mysql;

import java.awt.CardLayout;
import java.sql.*;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Database {

    Connection cn;
    //public static Connection cn;
    Statement st;
    ResultSet rs;
    ResultSetMetaData md;
    PreparedStatement ps;
    Config config = new Config(); //Config.java
    /*Get the first name of Employee for Greetings --- Modules.java */
    public static String getFirstName;
    /* Get the information of Employee --- EmployeeInfo.java */
    public static String[] getEmployeeInfo;
    public static int getEmployeeUserType;
    /* Item Info */
    public static String[] book;
    public static String[] reports = new String[3];
    public static String[] equip = new String[4];
    /* Database Table */
    final String[][] category = new String[][]{{"book", "bk_"}, {"reports", "rp_"}, {"equip", "eq_"}};

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(config.url,
                    config.username, config.password);
            st = cn.createStatement();

            System.out.println("Database Connected.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void disconnectDatabase() {
        try {
            cn.close();
            System.out.println("Database disconnected.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public boolean isAccessGranted(String username, String password) {
        boolean access = false;
        try {
            rs = st.executeQuery("SELECT * FROM employee");
            if (!rs.next()) {
                String query = "ALTER TABLE employee AUTO_INCREMENT 1";
                ps = cn.prepareStatement(query);
                ps.executeUpdate();
            }
            rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {

                if (username.equals(rs.getString("emp_num"))
                        && password.equals(rs.getString("emp_pw"))) {
                    getFirstName = rs.getString("emp_fn");
                    access = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return access;
    }

    public boolean isAdmin(String username) {
        boolean admin = false;
        try {
            rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                if (username.equals(rs.getString("emp_num"))
                        && rs.getString("emp_ut").equals("1")) {
                    admin = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return admin;
    }

    public boolean isEmployeeExisted(String emp_num) {
        boolean existed = false;
        getEmployeeInfo = new String[4];
        try {
            rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                if (emp_num.equals(rs.getString("emp_num"))) {
                    existed = true;
                    getEmployeeInfo[0] = rs.getString("emp_sn");
                    getEmployeeInfo[1] = rs.getString("emp_fn");
                    getEmployeeInfo[2] = rs.getString("emp_mi");
                    getEmployeeInfo[3] = rs.getString("emp_dept");
                    getEmployeeUserType = Integer.parseInt(rs.getString("emp_ut"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return existed;
    }

    public boolean isNewUser(String username) {
        boolean newuser = false;
        try {
            rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                if (username.equals(rs.getString("emp_num"))
                        && rs.getString("emp_pw").isEmpty()) {
                    newuser = true;
                }
            }
        } catch (Exception e) {
            newuser = true;
            //System.out.println("Error: " + e);
        }
        return newuser;
    }

    public void updatePassword(String username, String password) {
        try {
            String query = "UPDATE employee "
                    + "SET emp_pw = ?"
                    + "WHERE emp_num = ?";
            ps = cn.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, username);
            ps.executeUpdate();
            rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                if (rs.getString("emp_num").equals(username)) {
                    getFirstName = rs.getString("emp_fn");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

//    public String[][] getTable(ArrayList<String> item, ArrayList<String> qty) {
//        String[][] table = null;
//        int row = 0; //init
//        try {
//        } catch (Exception e) {
//        }
//        return table;
//    }
    public String[][] getTable(String[] columns, int button) {
        String[][] table = null;
        int row = 0;//init
        try {
            /* GET ROW COUNT */
            rs = st.executeQuery("SELECT COUNT(*) FROM " + category[button][0]);
            while (rs.next()) {
                row = Integer.parseInt(rs.getString(1));
            }

            /* GET DATA */
            rs = st.executeQuery("SELECT * FROM " + category[button][0]);
            table = new String[row][columns.length];
            for (row = 0; rs.next(); row++) {
                for (int i = 0; i < columns.length; i++) {
                    table[row][i] = rs.getString(columns[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return table;
    }

    public String[][] getSearch(String[] columns, String search, int button,
            boolean[] check) {
        String table[][] = null;
        int row = 0;
        String query = "";
        try {

            /* GET NUMBER OF ROWS */
            query = "SELECT COUNT(*) FROM " + category[button][0] + " WHERE ";

            //Modified
            if (button == 0 || button == 1) {
                if (check[0]) {
                    query += category[button][1]
                            + "title LIKE '%" + search + "%'";
                }
                if (check[0] && check[1]) {
                    query += " OR ";
                }
                if (check[1]) {
                    query += category[button][1]
                            + "author LIKE '%" + search + "%'";
                }
            } else {
                if (check[0]) {
                    query += "bir_prop_num LIKE '%" + search + "%'";
                }
                if (check[0] && check[1]) {
                    query += " OR ";
                }
                if (check[1]) {
                    query += "eq_desc LIKE '%" + search + "%'";
                }
                if (check[1] && check[2]) {
                    query += " OR ";
                }
                if (check[0] && check[2]) {
                    query += " OR ";
                }
                if (check[2]) {
                    query += "eq_serial_num LIKE '%" + search + "%'";
                }
            }



//Original
//            for (int i = 0; i < columns.length; i++) {
//                if (i == columns.length - 1) {
//                    query += columns[i] + " LIKE '%" + search + "%'";
//                } else {
//                    query += columns[i] + " LIKE '%" + search + "%' OR ";
//                }
//            }

            rs = st.executeQuery(query);
            while (rs.next()) {
                row = Integer.parseInt(rs.getString(1));
            }

            /* GET TABLE DATA*/
            query = "SELECT * FROM " + category[button][0] + " WHERE ";

            //Modified
            if (button == 0 || button == 1) {
                if (check[0]) {
                    query += category[button][1]
                            + "title LIKE '%" + search + "%'";
                }
                if (check[0] && check[1]) {
                    query += " OR ";
                }
                if (check[1]) {
                    query += category[button][1]
                            + "author LIKE '%" + search + "%'";
                }
            } else {
                if (check[0]) {
                    query += "bir_prop_num LIKE '%" + search + "%'";
                }
                if (check[0] && check[1]) {
                    query += ", ";
                }
                if (check[1]) {
                    query += "eq_desc LIKE '%" + search + "%'";
                }
                if (check[1] && check[2]) {
                    query += " OR ";
                }
                if (check[0] && check[2]) {
                    query += " OR ";
                }
                if (check[2]) {
                    query += "eq_serial_num LIKE '%" + search + "%'";
                }
            }



            //ORIGINAL
//            for (int i = 0; i < columns.length; i++) {
//                if (i == columns.length - 1) {
//                    query += columns[i] + " LIKE '%" + search + "%'";
//                } else {
//                    query += columns[i] + " LIKE '%" + search + "%' OR ";
//                }
//            }
            rs = st.executeQuery(query);
            table = new String[row][columns.length];
            for (row = 0; rs.next(); row++) {
                for (int i = 0; i < columns.length; i++) {
                    table[row][i] = rs.getString(columns[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return table;
    }

    public boolean isItemExisted(String item_number, int tab) {
        boolean exist = false;
        book = new String[4];
        String query = "";
        try {
            query = "SELECT * FROM " + category[tab][0] + " WHERE "
                    + category[tab][1] + "itemnumber = '" + item_number + "'";
            rs = st.executeQuery(query);
            while (rs.next()) {
                if (item_number.equals(rs.getString(category[tab][1]
                        + "itemnumber"))) {
                    switch (tab) {
                        case 0: {
                            book[0] = rs.getString("bir_prop_num");
                            book[1] = rs.getString("bk_title");
                            book[2] = rs.getString("bk_author");
                            book[3] = rs.getString("bk_qty");
                        }
                        break;
                        case 1: {
                            reports[0] = rs.getString("rp_title");
                            reports[1] = rs.getString("rp_author");
                            reports[2] = rs.getString("rp_qty");
                        }
                        break;
                        case 2: {
                            equip[0] = rs.getString("bir_prop_num");
                            equip[1] = rs.getString("eq_desc");
                            equip[2] = rs.getString("eq_serial_num");
                            equip[3] = rs.getString("eq_qty");
                        }
                        break;
                    }
                    exist = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return exist;
    }

    public void updateItem(String[] data, int tab) {
        String query = "UPDATE " + category[tab][0] + " ";
        query += tab == 0
                ? "SET bir_prop_num = ?, bk_title = ?, bk_author = ?, "
                + "bk_qty = ? WHERE bk_itemnumber = ?"
                : tab == 1
                ? "SET rp_title = ?, rp_author = ?, rp_qty = ? "
                + "WHERE rp_itemnumber = ?"
                : "SET bir_prop_num = ?, eq_desc = ?, eq_serial_num = ?, "
                + "eq_qty = ? "
                + "WHERE eq_itemnumber = ?";
        try {
            ps = cn.prepareStatement(query);
            for (int i = 0; i < data.length; i++) {
                ps.setString(i + 1, data[(i + 1) % data.length]);
            }
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public String getItemNumber(int tab) {
        String item_number = "";
        try {
            rs = st.executeQuery("SELECT * FROM " + category[tab][0]);
            while (rs.next()) {
                item_number = rs.getString(category[tab][1] + "itemnumber");
                item_number = item_number.substring(1, 7);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return item_number;
    }

    public void addItem(String[] data, int tab) {
        String query = tab == 0
                ? "INSERT INTO book(bk_itemnumber, bir_prop_num, " //bk
                + "bk_title, bk_author, bk_qty) VALUES(?, ?, ?, ?, ?)"
                : tab == 1
                ? "INSERT INTO reports(rp_itemnumber, rp_title, rp_author, "//rp
                + "rp_qty)"
                + " VALUES(?, ?, ?, ?)"
                : "INSERT INTO equip(eq_itemnumber, bir_prop_num, "//eq
                + "eq_desc, eq_serial_num, eq_qty) VALUES(?, ?, ?, ?, ?)";
        try {
            ps = cn.prepareStatement(query);
            for (int i = 0; i < data.length; i++) {
                ps.setString(i + 1, data[i]);
            }
            ps.executeUpdate();

            /**/

            query = tab == 0
                    ? "UPDATE book "//bk
                    + "SET bk_avail = bk_qty "
                    + "WHERE bk_itemnumber = ?"
                    : tab == 1
                    ? "UPDATE reports "//rp
                    + "SET rp_avail = rp_qty "
                    + "WHERE rp_itemnumber = ?"
                    : "UPDATE equip "//eq
                    + "SET eq_avail = eq_qty "
                    + "WHERE eq_itemnumber = ?";
            ps = cn.prepareStatement(query);
            ps.setString(1, data[0]);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void deleteItem(String item_number, int tab) {
        String query = "DELETE FROM " + category[tab][0] + " WHERE "
                + category[tab][1] + "itemnumber = ?";
        try {
            ps = cn.prepareStatement(query);
            ps.setString(1, item_number);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void setAutoIncrementDefault(int tab) {
        String query = "ALTER TABLE " + category[tab][0] + " "
                + "AUTO_INCREMENT = 1";
        try {
            ps = cn.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void addEmployee(String[] data) {
        String query = "INSERT INTO employee(emp_num, emp_sn, emp_fn, "
                + "emp_mi, emp_dept, emp_ut) VALUES(?, ?, ?, ?, ?, ?)";
        try {
            ps = cn.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(data[0]));
            for (int i = 1; i < 5; i++) {
                ps.setString(i + 1, data[i]);
            }
            ps.setString(6, data[5]);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void updateEmployee(String[] data, boolean reset) {
        String query = "UPDATE employee "
                + "SET emp_sn = ?, emp_fn = ?, emp_mi = ?, emp_dept = ?, "
                + "emp_ut = ? WHERE emp_num = ?";
        try {
            ps = cn.prepareStatement(query);
            for (int i = 0; i < 6; i++) {
                ps.setString(i + 1, data[(i + 1) % data.length]);
            }
            ps.executeUpdate();
            if (reset) {
                query = "UPDATE employee "
                        + "SET emp_pw = null WHERE emp_num = ?";
                ps = cn.prepareStatement(query);
                ps.setString(1, data[0]);
                ps.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public boolean isEmployeeMatched(String[] data) {
        boolean match = false;
        try {
            rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                if (data[0].equals(rs.getString("emp_sn"))
                        && data[1].equals(rs.getString("emp_fn"))) {
                    match = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return match;
    }

    public String[][] getBorrowItem(String emp_num,
            String[] columns) {
        String[][] item = null;
        String query = "";
        int row = 0; //init
        try {
            /* GET ROW COUNT */
            query = "SELECT COUNT(*) FROM transaction WHERE "
                    + "emp_num = " + emp_num;
            rs = st.executeQuery(query);
            while (rs.next()) {
                row = Integer.parseInt(rs.getString(1));
            }

            /* SET TABLE DIMENSION ROW X COLUMN */
            item = new String[row][columns.length];

            /* GET DATA */
            query = "SELECT * FROM transaction WHERE emp_num = " + emp_num;
            rs = st.executeQuery(query);
            for (row = 0; rs.next(); row++) {
                for (int i = 0; i < columns.length; i++) {
                    item[row][i] = rs.getString(columns[i]);
                }
            }

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return item;
    }

    /**
     *
     * @param inum item number
     * @param digit_1 the category of the item number
     * @param columns selected columns of category
     * @return
     */
    public String[] getItemInfo(String inum, int digit_1, String[] columns) {
        String[] info = new String[columns.length];
        String query = "";
        try {
            query = "SELECT ";
            for (int i = 0; i < columns.length; i++) {
                if (i == columns.length - 1) {
                    query += columns[i] + " ";
                } else {
                    query += columns[i] + ", ";
                }
            }
            query += "FROM " + category[digit_1 - 1][0] + " WHERE "
                    + category[digit_1 - 1][1] + "itemnumber = " + inum;
            rs = st.executeQuery(query);
            while (rs.next()) {
                for (int i = 0; i < columns.length; i++) {
                    info[i] = rs.getString(columns[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return info;
    }

    public void setTransaction(String emp_num, ArrayList<String> item,
            ArrayList<String> qty, String dateborrowed, String duedate) {
        try {

            /* TRANSACTION */
            String query = "INSERT INTO transaction(emp_num, itemnumber, qty, "
                    + "dateborrowed, duedate) VALUES(?, ?, ?, ?, ?)";
            for (int i = 0; i < item.size(); i++) {
                ps = cn.prepareStatement(query);
                ps.setString(1, emp_num);
                ps.setString(2, item.get(i));
                ps.setString(3, qty.get(i));
                ps.setString(4, dateborrowed);
                ps.setString(5, duedate);
                ps.executeUpdate();
            }

            /* TRANSACTION REPORTS */
            query = "INSERT INTO transactionreports(emp_num, itemnumber, qty, "
                    + "dateborrowed, duedate, date) VALUES(?, ?, ?, ?, ?, ?)";
            for (int i = 0; i < item.size(); i++) {
                ps = cn.prepareStatement(query);
                ps.setString(1, emp_num);
                ps.setString(2, item.get(i));
                ps.setString(3, qty.get(i));
                ps.setString(4, dateborrowed);
                ps.setString(5, duedate);
                ps.setString(6, dateborrowed);
                ps.executeUpdate();
            }

            /* UPDATE ITEM(S) */
            for (int i = 0; i < item.size(); i++) {
                if (item.get(i).substring(0, 1).equals("1")) {
                    query = "UPDATE book "
                            + "SET bk_borrowed = bk_borrowed + ?, "
                            + "bk_avail = bk_avail - ? "
                            + "WHERE bk_itemnumber = ?";
                    ps = cn.prepareStatement(query);
                    ps.setString(1, qty.get(i));
                    ps.setString(2, qty.get(i));
                    ps.setString(3, item.get(i));
                    ps.executeUpdate();
                } else if (item.get(i).substring(0, 1).equals("2")) {
                    query = "UPDATE reports "
                            + "SET rp_borrowed = rp_borrowed + ?, "
                            + "rp_avail = rp_avail - ? "
                            + "WHERE rp_itemnumber = ?";
                    ps = cn.prepareStatement(query);
                    ps.setString(1, qty.get(i));
                    ps.setString(2, qty.get(i));
                    ps.setString(3, item.get(i));
                    ps.executeUpdate();
                } else if (item.get(i).substring(0, 1).equals("3")) {
                    query = "UPDATE equip "
                            + "SET eq_borrowed = eq_borrowed + ?, "
                            + "eq_avail = eq_avail - ? "
                            + "WHERE eq_itemnumber = ?";
                    ps = cn.prepareStatement(query);
                    ps.setString(1, qty.get(i));
                    ps.setString(2, qty.get(i));
                    ps.setString(3, item.get(i));
                    ps.executeUpdate();
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.out.println("asdfasdf");
        }
    }

    public String[] getBorrowedItemNumber(String employeenumber) {
        String query = "";
        String[] borroweditems = null;
        int row = 0;
        try {
            /* COUNT NUMBER OF ROWS */
            query = "SELECT COUNT(*) FROM transaction WHERE emp_num = "
                    + employeenumber;
            rs = st.executeQuery(query);
            while (rs.next()) {
                row = rs.getInt(1);
            }
            borroweditems = new String[row];
            query = "SELECT itemnumber FROM transaction WHERE emp_num = "
                    + employeenumber;
            rs = st.executeQuery(query);
            for (int i = 0; rs.next(); i++) {
                borroweditems[i] = rs.getString("itemnumber");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return borroweditems;
    }

    public String[] getBorrowedItemQty(String employeenumber) {
        String query = "";
        String[] borroweditems = null;
        int row = 0;
        try {
            /* COUNT NUMBER OF ROWS */
            query = "SELECT COUNT(*) FROM transaction WHERE emp_num = "
                    + employeenumber;
            rs = st.executeQuery(query);
            while (rs.next()) {
                row = rs.getInt(1);
            }
            borroweditems = new String[row];
            query = "SELECT itemnumber FROM transaction WHERE emp_num = "
                    + employeenumber;
            rs = st.executeQuery(query);
            for (int i = 0; rs.next(); i++) {
                borroweditems[i] = rs.getString("itemnumber");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return borroweditems;
    }

    public String[][] getItemInfo(int digit, String number, String[] column) {
        String data[][] = null;
        String query = "";
        int row = 0;
        try {
            query = "SELECT COUNT(*) FROM " + category[digit - 1][0] + " WHERE "
                    + category[digit - 1][1] + "itemnumber = "
                    + number;
            rs = st.executeQuery(query);
            while (rs.next()) {
                row = rs.getInt(1);
            }

            data = new String[row][column.length];

            query = "SELECT ";
            for (int i = 0; i < column.length; i++) {
                if (i == column.length - 1) {
                    query += column[i] + " ";
                } else {
                    query += column[i] + ", ";
                }
            }
            query += "FROM " + category[digit - 1][0] + " WHERE "
                    + category[digit - 1][1] + "itemnumber = " + number;

            rs = st.executeQuery(query);
            for (row = 0; rs.next(); row++) {
                for (int j = 0; j < data[row].length; j++) {
                    data[row][j] = rs.getString(column[j]);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return data;

    }

    public String getQuantity(String number) {
        String qty = "";
        String query = "";
        try {
            query = "SELECT qty FROM transaction WHERE itemnumber = " + number;
            rs = st.executeQuery(query);
            while (rs.next()) {
                qty = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return qty;
    }

    public void returnItems(String number, String qty, String item,
            String date) {
        try {

            /* UPDATE TRANSACTION */
            String query = "UPDATE transaction "
                    + "SET datereturned = ?, "
                    + "qty = (qty  - ?) "
                    + "WHERE emp_num = ? AND itemnumber = ?";
            if (!item.isEmpty()) {
                ps = cn.prepareStatement(query);
                ps.setString(1, date);
                ps.setString(2, qty);
                ps.setString(3, number);
                ps.setString(4, item);
                ps.executeUpdate();
            }

            if (item.substring(0, 1).equals("1")) {
                query = "UPDATE book "
                        + "SET bk_borrowed = bk_borrowed - ?, "
                        + "bk_avail = bk_avail + ? "
                        + "WHERE bk_itemnumber = ?";
                ps = cn.prepareStatement(query);
                ps.setString(1, qty);
                ps.setString(2, qty);
                ps.setString(3, item);
                ps.executeUpdate();
            } else if (item.substring(0, 1).equals("2")) {
                query = "UPDATE reports "
                        + "SET rp_borrowed = rp_borrowed - ?, "
                        + "rp_avail = rp_avail + ? "
                        + "WHERE rp_itemnumber = ?";
                ps = cn.prepareStatement(query);
                ps.setString(1, qty);
                ps.setString(2, qty);
                ps.setString(3, item);
                ps.executeUpdate();
            } else if (item.substring(0, 1).equals("3")) {
                query = "UPDATE equip "
                        + "SET eq_borrowed = eq_borrowed - ?, "
                        + "eq_avail = eq_avail + ? "
                        + "WHERE eq_itemnumber = ?";
                ps = cn.prepareStatement(query);
                ps.setString(1, qty);
                ps.setString(2, qty);
                ps.setString(3, item);
                ps.executeUpdate();
            }

            query = "INSERT INTO transactionreports(datereturned, qty, "
                    + "emp_num,itemnumber, date) VALUES(?, ?, ?, ?, ?)";
            if (!item.isEmpty()) {
                ps = cn.prepareStatement(query);
                ps.setString(1, date);
                ps.setString(2, qty);
                ps.setString(3, number);
                ps.setString(4, item);
                ps.setString(5, date);
                ps.executeUpdate();
            }

            /*DELETE TRANSACTION IF THE QUANTITY IS ZERO*/
            query = "DELETE FROM transaction WHERE qty = 0";
            ps = cn.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public String[][] getSummary(String[] columns) {
        String[][] table = null;
        int row = 0;//init
        try {
            /* GET ROW COUNT */
            rs = st.executeQuery("SELECT COUNT(*) FROM transactionreports");
            while (rs.next()) {
                row = Integer.parseInt(rs.getString(1));
            }

            /* GET DATA */
            rs = st.executeQuery("SELECT * FROM transactionreports");
            table = new String[row][columns.length];
            for (row = 0; rs.next(); row++) {
                for (int i = 0; i < columns.length; i++) {
                    table[row][i] = rs.getString(columns[i]);
                    System.out.println(table[row][i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return table;
    }

    public ArrayList<String> getEmployee(String emp_num) {
        ArrayList<String> employee = new ArrayList<>();
        try {
            rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                if (emp_num.equals(rs.getString("emp_num"))) {
                    employee.clear();
                    employee.add(0, rs.getString("emp_sn"));
                    employee.add(1, rs.getString("emp_fn"));
                    employee.add(2, rs.getString("emp_dept"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return employee;
    }

    public String[][] getTableReserve(String[] columns) {
        String[][] table = null;
        int row = 0;//init
        try {
            /* GET ROW COUNT */
            rs = st.executeQuery("SELECT COUNT(*) FROM conrm_reserve where conrm_date = '" + frms.conrm.ConRoomCalendar.date + "'");
            while (rs.next()) {
                row = Integer.parseInt(rs.getString(1));
            }

            /* GET DATA */
            rs = st.executeQuery("SELECT * FROM conrm_reserve where conrm_date = '" + frms.conrm.ConRoomCalendar.date + "' order by conrm_date, conrm_timestart");
            table = new String[row][columns.length];
            for (row = 0; rs.next(); row++) {
                for (int i = 0; i < columns.length; i++) {
                    table[row][i] = rs.getString(columns[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }
        return table;
    }

    public String searchData(String num) {

        String dept = "";
        try {
            rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                if (num.equals(rs.getString("emp_num"))) {
                    dept = rs.getString("emp_dept");
                }
            }
        } catch (Exception e) {
            System.out.println("Access Denied.");
        }
        return dept;
    }

    //This part is Regalado's work
    public String[][] getTableReserve_conrm(String[] columns) {
        String[][] table = null;
        int row = 0;//init
        try {
            /* GET ROW COUNT */
            rs = st.executeQuery("SELECT COUNT(*) FROM conrm_reserve where conrm_date = '" + frms.conrm.ConRoomCalendar.date + "'");
            while (rs.next()) {
                row = Integer.parseInt(rs.getString(1));
            }

            /* GET DATA */
            rs = st.executeQuery("SELECT * FROM conrm_reserve where conrm_date = '" + frms.conrm.ConRoomCalendar.date + "' order by conrm_date,conrm_timestart");
            table = new String[row][columns.length];
            for (row = 0; rs.next(); row++) {
                for (int i = 0; i < columns.length; i++) {
                    table[row][i] = rs.getString(columns[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }
        return table;
    }


    public void addItem(String[] data) {

        String query = "INSERT INTO conrm_reserve VALUES (?,?,?,?,?,?)";
        try {
            ps = cn.prepareStatement(query);
            for (int i = 0; i < data.length; i++) {
                ps.setString(i + 1, data[i]);
            }
            ps.executeUpdate();
            int result = JOptionPane.showConfirmDialog(null, "Conference Room reservation is successful!",
                    "Information Message", JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {
                CardLayout card = (CardLayout) frms.conrm.ConRoomSchedule.pnlRight.getLayout();
                card.show(frms.conrm.ConRoomSchedule.pnlRight, "cardReserve");
// refresh the table


                frms.conrm.ConRoomReserve.tblReserveA.setModel(new DefaultTableModel(
                        getTableReserve(frms.conrm.ConRoomReserve.reserve_column), frms.conrm.ConRoomReserve.reserve_column_header));
                frms.conrm.ConRoomReserve.tblReserveB.setModel(new DefaultTableModel(
                        getTableReserve(frms.conrm.ConRoomReserve.reserve_column), frms.conrm.ConRoomReserve.reserve_column_header));
                frms.conrm.ConRoomCalendar.manipulateTableReserve();
//clearing the values

                frms.conrm.ConRoom_Approval.timeEnd.clear();
                frms.conrm.ConRoom_Approval.cmb_timeEnds.setModel(new DefaultComboBoxModel(frms.conrm.ConRoom_Approval.timeEnd.toArray()));
                frms.conrm.ConRoomReserve.timeStart.clear();
                frms.conrm.ConRoomCalendar.time_reserveA.clear();
                frms.conrm.ConRoomCalendar.time_reserveB.clear();
                frms.conrm.ConRoomCalendar.table_reserveA.clear();
                frms.conrm.ConRoomCalendar.rowA.clear();
                Arrays.fill(frms.conrm.ConRoomCalendar.dataA, null);
                Arrays.fill(frms.conrm.ConRoomCalendar.dataB, null);

            }
        } catch (Exception e) {
            System.out.print(e);
        }





    }

    public void deleteItem(String[] str_delete, String str) {

// delete the item from the database
        String query = "DELETE FROM conrm_reserve WHERE conrm_timestart = '" + str_delete[0] + "' and conrm_type = '" + str + "'";
        try {
            ps = cn.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

// refresh the table
        frms.conrm.ConRoomReserve.tblReserveA.setModel(new DefaultTableModel(
                getTableReserve(frms.conrm.ConRoomReserve.reserve_column), frms.conrm.ConRoomReserve.reserve_column_header));
        frms.conrm.ConRoomReserve.tblReserveB.setModel(new DefaultTableModel(
                getTableReserve(frms.conrm.ConRoomReserve.reserve_column), frms.conrm.ConRoomReserve.reserve_column_header));
        frms.conrm.ConRoomCalendar.manipulateTableReserve();

    }//Regalado's work ends
////
////    public void addItem(String[] data) {
////
////        String query = "INSERT INTO conrm_reserve(conrm_date, conrm_timestart, conrm_timeend, emp_num, emp_dept) VALUES (?, ?, ?, ?, ?)";
////        try {
////            ps = cn.prepareStatement(query);
////            for (int i = 0; i < data.length; i++) {
////                ps.setString(i + 1, data[i]);
////            }
////            ps.executeUpdate();
////            int result = JOptionPane.showConfirmDialog(null, "Conference Room reservation is successful!",
////                    "Information Message", JOptionPane.PLAIN_MESSAGE);
////            if (result == JOptionPane.OK_OPTION) {
////                CardLayout card = (CardLayout) frms.conrm.ConRoomSchedule.pnlRight.getLayout();
////                card.show(frms.conrm.ConRoomSchedule.pnlRight, "cardReserve");
////// refresh the table
////
////
////                frms.conrm.conRoomReserve.tblReserve.setModel(new DefaultTableModel(
////                        getTableReserve(frms.conrm.ConRoomReserve.reserve_column), frms.conrm.ConRoomReserve.reserve_column_header));
////                frms.conrm.ConRoomCalendar.manipulateTableReserve();
//////clearing the values
////                frms.conrm.conRoom_Approval.txtFinalDate.setText(null);
////                frms.conrm.conRoomReserve.txtDate.setText(null);
////                frms.conrm.conRoom_Approval.timeEnd.clear();
////                frms.conrm.conRoomReserve.timeStart.clear();
////                frms.conrm.ConRoomCalendar.time_reserve.clear();
////                frms.conrm.ConRoomCalendar.table_reserve.clear();
////                frms.conrm.ConRoomCalendar.row.clear();
////                Arrays.fill(data, null);
////            }
////        } catch (Exception e) {
////            System.out.print(e);
////        }
////    }
////
////    public void deleteItem(String[] str_delete) {
////
////// delete the item from the database
////        String query = "DELETE FROM conrm_reserve WHERE conrm_timestart = '" + str_delete[0] + "'";
////        try {
////            ps = cn.prepareStatement(query);
////            ps.executeUpdate();
////        } catch (Exception e) {
////            System.out.println("Error: " + e);
////        }
////
////// refresh the table
////        frms.conrm.conRoomReserve.tblReserve.setModel(new DefaultTableModel(
////                getTableReserve(frms.conrm.conRoomReserve.reserve_column), frms.conrm.conRoomReserve.reserve_column_header));
////        frms.conrm.ConRoomCalendar.manipulateTableReserve();
////
////    }
////
////    public String[][] getTransaction(String item, String[] column) {
////        int row = 1;
////        int col = column.length;
////        String[][] table = new String[row][col];
////
////        try {
////            String query = "SELECT * FROM transaction WHERE itemnumber = " + item;
////            rs = st.executeQuery(query);
////            for (row = 0; rs.next(); row++) {
////                for (int i = 0; i < column.length; i++) {
////                    table[row][i] = rs.getString(column[i]);
////                }
////
////            }
////        } catch (Exception e) {
////            System.out.println("Error: " + e);
////        }
////        return table;
////    }
}
