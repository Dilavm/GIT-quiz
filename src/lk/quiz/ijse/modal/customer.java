/*---------------------------------------------------------------------------------------------
 *  Copyright (c) dilanjana vimukthi. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

package lk.quiz.ijse.modal;

/**
 *
 * @author <dilanjanavimukthi@gmail.com> dilanjana
 */
public class customer {
    private String name;
    private String address;
    private int tel;

    public customer() {
    }

    public customer(String name, String address, int tel) {
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTel() {
        return tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
    
}
