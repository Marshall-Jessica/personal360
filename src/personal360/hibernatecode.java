/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personal360;

/**
 *
 * @author Jessica
 * This is an example of how hibernate is a solution to map classes to SQL database
 * tables.
 */
public class hibernatecode {
    private int pincode;
    private String name;
    
    public hibernatecode() {}
    public hibernatecode(String newname, int newcode){
            this.name = newname;
            this.pincode = newcode;
    }
    public int getCode() {
        return pincode;
    }
    public void setCode( int code ) {
        this.pincode = code;
    }
    public String getName() {
        return name;
    }
    public void setName( String user_name) {
        this.name = user_name;
    }
}
/*
create table PINCODE (
    pinecode INT NOT NULL auto_increment,
    name VARCHAR(20) defaulf NULL,
    PRIMARY KEY (id)
);

Next is to create the PHP code to connect to the database and enter in data.
*/