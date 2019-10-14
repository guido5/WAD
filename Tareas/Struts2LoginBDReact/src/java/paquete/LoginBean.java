package paquete;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

class LoginBean 
{
    private HashMap validUsers = new HashMap();
    private DBConfig dbConfig = new DBConfig();
    private String user;
    private String pass;

    public LoginBean()
    {
        validUsers.put("ruben","rpv");
        validUsers.put("administrator","admin");
    }

    public LoginBean(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public boolean validateUser(String userName, String password)
    {
        if(validUsers.containsKey(userName))
        {
         String thePassword = (String)validUsers.get(userName);
         if(thePassword.equals(password))
         return true;
        }
        return false;
    }

    public boolean validateUser() throws SQLException {
        String sqlSentence = "SELECT password FROM login WHERE user='" + user + "'";
        ResultSet resultSet = dbConfig.executeSQLSentence(sqlSentence);
        resultSet.first();
        if (pass.equals(resultSet.getString("password"))){
            return true;
        }
        return false;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
