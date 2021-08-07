/*---------------------------------------------------------------------------------------------
 *  Copyright (c) dilanjana vimukthi. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package lk.quiz.ijse.controller;

import ik.quiz.ijse.db.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lk.quiz.ijse.modal.customer;

/**
 *
 * @author <dilanjanavimukthi@gmail.com> dilanjana
 */
public class customerController {

    Connection conn;

    public boolean saveCustomer(customer cus) {
        try {
            conn = DBConnect.getInstance().getConnection();
            String sql = "INSERT INTO customer VALUES (?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, cus.getName());
            pst.setString(2, cus.getAddress());
            pst.setInt(3, cus.getTel());

            int executeUpdate = pst.executeUpdate();
            if (executeUpdate > 0) {
                System.out.println("added");
                return true;
            }else{
                return false;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        
        return false;
    }
}
