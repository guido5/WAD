package LoginConfig;

import java.sql.*;

public class DBConfig {
    private final String DBDriver = "com.mysql.cj.jdbc.Driver";
    private final String DB = "jdbc:mysql://localhost/login?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String user = "root";
    private final String pass = "root";
    private Connection db;


    public DBConfig() {
        try {
            Class.forName(DBDriver);
            db = DriverManager.getConnection(DB, user, pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getDBDriver() {
        return DBDriver;
    }

    public String getDB() {
        return DB;
    }

    public ResultSet executeSQLSentence (String sqlSentence) {
        try {
            Statement statement = db.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlSentence);
            return resultSet;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }
    }
}
