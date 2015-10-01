/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personal360;

/**
 *
 * @author Jessica
 */
public class hibernate {
       private int id;
       private String firstName; 
       private String lastName;   
       private int salary;  

       public hibernate() {}
       public hibernate(String fname, String lname, int salary) {
          this.firstName = fname;
          this.lastName = lname;
          this.salary = salary;
       }
       public int getId() {
          return id;
       }
       public void setId( int id ) {
          this.id = id;
       }
       public String getFirstName() {
          return firstName;
       }
       public void setFirstName( String first_name ) {
          this.firstName = first_name;
       }
       public String getLastName() {
          return lastName;
       }
       public void setLastName( String last_name ) {
          this.lastName = last_name;
       }
       public int getSalary() {
          return salary;
       }
       public void setSalary( int salary ) {
          this.salary = salary;
       }
}
/*
Create database tables in the sql database
create table EMPLOYEE (
   id INT NOT NULL auto_increment,
   first_name VARCHAR(20) default NULL,
   last_name  VARCHAR(20) default NULL,
   salary     INT  default NULL,
   PRIMARY KEY (id)
);

The next step is to create a mapping file to instruct Hibernate
how to map the class to the database.

<hibernate-mapping>
   <class name="Employee" table="EMPLOYEE">
      <meta attribute="class-description">
         This class contains the employee detail. 
      </meta>
      <id name="id" type="int" column="id">
         <generator class="native"/>
      </id>
      <property name="firstName" column="first_name" type="string"/>
      <property name="lastName" column="last_name" type="string"/>
      <property name="salary" column="salary" type="int"/>
   </class>
</hibernate-mapping>

*/