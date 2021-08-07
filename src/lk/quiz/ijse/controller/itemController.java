/*---------------------------------------------------------------------------------------------
 *  Copyright (c) dilanjana vimukthi. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package lk.quiz.ijse.controller;

import ik.quiz.ijse.db.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lk.quiz.ijse.modal.item;

/**
 *
 * @author <dilanjanavimukthi48@gmail.com> dilanjana
 */
public class itemController {

    Connection conn;

    public boolean saveItem(item item) {
        try {
            conn = DBConnect.getInstance().getConnection();
            String sql = "INSERT INTO item VALUES (?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, item.getCode());
            pst.setString(2, item.getName());
            pst.setInt(3, item.getPrice());

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
