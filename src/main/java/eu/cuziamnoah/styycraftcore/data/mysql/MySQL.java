package eu.cuziamnoah.styycraftcore.data.mysql;

import java.sql.*;

import eu.cuziamnoah.styycraftcore.data.Data;
import org.bukkit.Bukkit;

public class MySQL {

    public static Connection connection;

    public static void connect() {
        if (!isConnected()) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://" + Data.MySQLHost + ":" + Data.MySQLPort + "/" + Data.MySQLDatabase + "?autoReconnect=true", Data.MySQLUser, Data.MySQLPassword);
                Bukkit.getConsoleSender().sendMessage("§aDie MySQL Verbindung wurde hergestellt.");
            } catch (SQLException var1) {
                Bukkit.getConsoleSender().sendMessage("§4Die MySQL Verbindung konnte nicht hergestellt werden.");
            }
        } else {
            System.out.println("Es besteht bereits eine MySQL Verbindung");
        }

    }

    public static ResultSet getResult(String sql) {
        if (isConnected()) {
            try {
                return connection.createStatement().executeQuery(sql);
            } catch (SQLException var2) {
                var2.printStackTrace();
            }
        }

        return null;
    }

    public static void close() {
        if (isConnected()) {
            try {
                connection.close();
            } catch (SQLException var1) {
                var1.printStackTrace();
            }
        }

    }

    public static boolean isConnected() {
        return connection != null;
    }

    public static void update(String qry) {
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(qry);
            st.close();
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
    }

}

