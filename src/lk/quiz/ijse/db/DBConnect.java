/*---------------------------------------------------------------------------------------------
 *  Copyright (c) dilanjana vimukthi. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package ik.quiz.ijse.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author <dilanjanavimukthi48@gmail.com> dilanjana
 */
public class DBConnect {

    private static DBConnect dbConnect;
    private Connection conn;

    private DBConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String host = "jdbc:mysql://localhost:3306/gitquiz?" + "autoReconnect=true&useSSL=false";
        String user = "root";
        String pass = "root";

        conn = DriverManager.getConnection(host, user, pass);
    }

    public static DBConnect getInstance() throws ClassNotFoundException, SQLException {
        return (dbConnect == null) ? (dbConnect = new DBConnect()) : (dbConnect);
    }

    public Connection getConnection() {
        return conn;
    }
}
