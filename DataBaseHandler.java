import java.sql.*;

public class DataBaseHandler extends ConfigsDb {
    Connection dbConnection;
    int idFromMixFood = 0;

    public Connection getDbConnection () throws SQLException {
        String connString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + dbTimeZone; //connection parameters string using JDBC
        dbConnection = DriverManager.getConnection(connString, dbUser, dbPass);
        return dbConnection;
    }

    // CRUD - querie
    public int selectIdIf (String sqlMorningFood, String sqlEveningFood, String sqlWater) throws SQLException {

        String strSelectDogFood = "SELECT id FROM " + ConstDb.USER_TABLE + " WHERE "
                + ConstDb.MIXFOOD_MORNING + " = " + "'" + sqlMorningFood + "'" + " AND "
                + ConstDb.MIXFOOD_EVENING + " = " + "'" + sqlEveningFood + "'" + " AND "
                + ConstDb.MIXFOOD_WATER + " = " + "'" + sqlWater + "'";

        Statement stmt = getDbConnection().createStatement();
        ResultSet rset = stmt.executeQuery(strSelectDogFood);
        while (rset.next()) {
            idFromMixFood = rset.getInt(ConstDb.MIXFOOD_ID);
        }
        return idFromMixFood;
    }

}
